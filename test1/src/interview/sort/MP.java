package interview.sort;

import java.util.Arrays;

/**
 * 冒泡排序算算法：通过多次重复比较，相邻两个数相比较选出最大/最小的，交换位置；
 * 时间复杂度为O（n²） 最好情况为O(n)
 * 时间复杂度：外循环最多n-1次（最少1次），
 * 第i次外循环时，内循环n-i次比较，
 * ∴最大比较次数为∑(i=1,n)n-i=n(n-1)/2≈n²/2
 * =O(n²)
 *
 * 空间复杂度为O(n+1)
 *
 * 稳定排序
 */
public class MP {
    public static void main(String[] arg) {
        int[] n = {1, 2, 3};
        int temp;
        boolean flag = false;/*若循环中记录未作交换,则说明序列已有序*/
        for (int i = 0; i < n.length - 1; i++) {
            System.out.println("1");
            for (int j = 0; j < n.length - i - 1; j++) {
                if (n[j] > n[j + 1]) {
                    temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
