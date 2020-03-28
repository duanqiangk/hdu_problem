package com.dqit.study.list1;

import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 16:35
 * @Description
 */
public class Problem1001 {
    private static Scanner sc = new Scanner(System.in);

    private static int sum(int n) {
        return n % 2 == 0 ? ( n / 2 * (n + 1)) : ( (n + 1) / 2 * n) ;
    }

    public static void main(String[] args) {
        while (sc.hasNext()) {
            System.out.println(sum(sc.nextInt()));
            System.out.println();
        }
    }
}
