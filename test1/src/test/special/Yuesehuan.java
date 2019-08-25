package test.special;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 约瑟环
 */
public class Yuesehuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入总人数：");
        int totalNum = scanner.nextInt();
        System.out.print("请输入报数的大小：");
        int cycleNum = scanner.nextInt();
        yuesefu(totalNum, cycleNum);
        scanner.close();
    }

    public static void yuesefu(int totalNum, int countNum) {
        // 初始化人数
        List<Integer> start = new ArrayList<Integer>();
        for (int i = 1; i <= totalNum; i++) {
            start.add(i);
        }
        // 从第K个开始计数
        int k = 0;
        while (start.size() > 0) {
            k = k + countNum;
            // 第m人的索引位置
            k = k % (start.size()) - 1;
            // 判断是否到队尾
            if (k < 0) {
                System.out.println(start.get(start.size() - 1));
                start.remove(start.size() - 1);
                k = 0;
            } else {
                System.out.println(start.get(k));
                start.remove(k);
            }
        }
    }


    private static int showJoseph(int total, int cycle) {
        boolean[] arr = new boolean[total];
        Arrays.fill(arr, true);
        int kill = 0;
        int index = 0;
        int result = 0;

        while (kill < total) {
            for (int i = 0; i < cycle; i++) {
                while (!arr[index]) {
                    index = (index + 1) % total;
                }
                if (i == cycle - 1) {
                    System.out.print((index + 1) + (kill < total - 1 ? " " : "\n"));
                    arr[index] = false;
                    kill++;
                }
                if (kill == total - 1) result = (index + 1);
                index = (index + 1) % total;
            }
        }
        return result;

    }
}

