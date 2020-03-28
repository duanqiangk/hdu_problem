package com.dqit.study.list1;

import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 20:38
 * @Description
 */
public class Problem1017 {
    private static Scanner sc = new Scanner(System.in);

    private static boolean check(int a, int b, int m) {
        double x = a * a + b * b + m;
        double y = a * b;
        double result = x / y;

        return (result - (int) result == 0.0);
    }

    private static int resultCount(int n, int m) {
        int sum = 0;

        for (int i = 1; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (check(i, j, m)) {
                    ++sum;
                }
            }
        }
        return sum;
    }

    private static String formatPrint(int caseCount, int resultCount) {
        return String.format("Case %d: %d", caseCount, resultCount);
    }

    public static void main(String[] args) {
        int N = sc.nextInt();

        while (N != 0) {
            --N;

            int caseCount = 1;
            while (sc.hasNext()) {
                int n = sc.nextInt();
                int m = sc.nextInt();

                if (n == 0 && m == 0) {
                    break;
                }

                System.out.println(formatPrint(caseCount++, resultCount(n, m)));
            }
            if (N != 0) {
                System.out.println();
            }
        }
    }
}
