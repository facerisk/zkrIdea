package interview;

import java.util.Scanner;

/**
 * 递归算出阶乘 5！=5*4*3*2*1
 */
public class Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        foo(n);
        System.out.println("结果：" + foo(n));
    }
    public static int foo(int i) {
        if (i == 1) {
            return 1;
        } else {
            return foo(i - 1) * i;
        }
    }
}
/**
 * do{
 * System.out.println("请输入：");
 * int n = sc.nextInt();
 * foo(n);
 * System.out.println("结果：" + foo(n));
 * System.out.println("继续请按 y ：");
 * s = sc.next();
 * }while ("y".equals(s));
 */
