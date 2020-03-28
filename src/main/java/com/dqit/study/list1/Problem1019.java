package com.dqit.study.list1;

import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 20:52
 * @Description
 */
public class Problem1019 {
    private static Scanner sc = new Scanner(System.in);

    private static int gcd(int a, int b) {
        int maxNum = a > b ? a : b;
        int minNum = a < b ? a : b;

        while (minNum != 0) {
            int temp = maxNum % minNum;
            maxNum = minNum;
            minNum = temp;
        }
        return maxNum;
    }

    private static int LCM(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        int N = sc.nextInt();
        while (N != 0) {
            N--;

            int n = sc.nextInt();
            int lcm = 0;
            for (int i = 0; i < n; ++i) {
                int inputNum = sc.nextInt();
                if (i == 0) {
                    lcm = inputNum;
                    continue;
                }
                lcm = LCM(lcm, inputNum);
            }
            System.out.println(lcm);
        }
    }
}
