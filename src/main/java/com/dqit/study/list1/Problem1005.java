package com.dqit.study.list1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 18:40
 * @Description
 */
public class Problem1005 {
    private static Scanner sc = new Scanner(System.in);

    /**
     * 初始化循环列表
     *
     * @return 初始化列表
     */
    private static List<Integer> initList() {
        List<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < 3; ++i) {
            result.add(1);
        }
        return result;
    }

    private static int getFn(int a, int b, int n) {
        List<Integer> arrange = initList();

        for (int i = 3; i <= 49; ++i) {
            arrange.add((a * arrange.get(i - 1) + b * arrange.get(i - 2)) % 7);
        }

        return arrange.get(n % 49);
    }

    public static void main(String[] args) {
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            if (a == 0 && b == 0 && n == 0) {
                return;
            }

            System.out.println(getFn(a, b, n));
        }
    }
}
