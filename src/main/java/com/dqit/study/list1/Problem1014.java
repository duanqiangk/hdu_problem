package com.dqit.study.list1;

import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 20:01
 * @Description
 */
public class Problem1014 {
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

    public static void main(String[] args) {
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = gcd(a, b);
            String suggestion = "Good Choice";
            if (gcd != 1) {
                suggestion = "Bad Choice";
            }
            System.out.println(String.format("%10d%10d    %s", a, b, suggestion));
            System.out.println();
        }
    }
}
