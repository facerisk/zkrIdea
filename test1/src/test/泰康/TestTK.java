package test.泰康;

/**
 * 考察try..catch..finally..return 逻辑顺序 与 成员变量：操作的是本身，不是引用
 */
public class TestTK {
    static String out = "";

    public static void foo(int i) {
        try {
            if (i == 1) {
                throw new Exception();
            }
            out += "1";

        } catch (Exception e) {
            out += "2";
            return;

        } finally {
            out += "3";
        }
        out += "4";
    }

    public static void main(String[] args) {
        foo(0);//134
        System.out.println(out);
        foo(1);//13423
        System.out.println(out);
    }
}
