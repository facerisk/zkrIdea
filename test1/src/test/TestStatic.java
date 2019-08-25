package test;

public class TestStatic {
//    static TestStatic TestStatic =new TestStatic();

    static int n;
    static int s = 0;

    {
        System.out.println("构造块");
    }
    static{
        n++;
        s++;
        System.out.println("静态块"+n);
        System.out.println("静态块"+s);
        System.out.println("静态块");
    }


    public TestStatic() {

    }

    public static void main(String []args){
        System.out.println(TestStatic.n);
        System.out.println(TestStatic.s);

        int i = new Integer("1");
        System.out.println(i);

        int a = 1;
        long b =1l;
        boolean n = a==b;
        System.out.println(n);


    }
}
