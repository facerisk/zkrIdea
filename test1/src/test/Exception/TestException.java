package test.Exception;

public class TestException extends Exception {
    static String resultType;

    /*无参构造函数*/
    public TestException(){
        super();
    }

    //用详细信息指定一个异常
    public TestException(String message){
        super(message);
    }

    //用指定的详细信息和原因构造一个新的异常
    public TestException(String message, Throwable cause){
        super(message,cause);
    }

    //用指定原因构造一个新的异常
    public TestException(Throwable cause) {
        super(cause);
    }



    /*结果resultType字段set方法*/
    public static void setResultType(String resultType) throws Exception {
        String resultTypeString;
        resultType = resultType == null ? null : resultType.trim();  //resultType结果封装

        //自定义一个resultTypeString字段,用来根据resultType的值(1,2,3)自动生成对应的文本
        /*这样写的好处是集中管理,后台代码中只在此处管理,不好的地方是运营时突然加一个值就会返回未知类型，要更新要把后端重新编译发布，也就意味着要重启（把值传给前端让前端判断是不用重启的）。这种方案只适用于类型固定的字段*/
        if (resultType!=null) {
            int rt = Integer.parseInt(resultType);   //将flag转换为int值
            switch (rt) {  //判断属于那种类型,就给resultTypeString赋予对应的值
                case 1:
                    resultTypeString ="未处理";
                    break;
                case 2:
                    resultTypeString ="自动解除";
                    break;
                case 3:
                    resultTypeString ="已解除";
                    //TODO 第一钟：直接抛异常
                   throw  new TestException("直接抛异常：resultType类型未完善"+"未知resultType:"+resultType);

//                    break;
                default:
                    resultTypeString = "未知类型";
                    /*这里一定要try catch异常,因为这是set方法,throw出去大部分情况是被框架获取*/
                    try {
                        /*实例化自定义异常*/
                        //TODO 第二种 捕获异常
                        TestException exception = new TestException("resultType类型未完善"+"未知resultType:"+resultType);
                        /*抛出异常*/
                        throw exception;
                    } catch (TestException e) { //捕获异常
                        System.err.println("异常信息:"+e.getMessage());  //获取异常信息,就是上面传的message
                        e.printStackTrace();  //把栈信息打印出来
                    }
                    break;
            }
        }else {
            resultTypeString = "";  //如果flag为null返回为空
        }
    }
     public static void main(String []args) throws Exception{
         setResultType("3");
     }
}
