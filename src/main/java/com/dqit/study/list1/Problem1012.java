package com.dqit.study.list1;

import java.math.BigDecimal;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 19:06
 * @Description
 */
public class Problem1012 {
    private static int N = 9;

    private static String formatLine(String a, String b) {
        return String.format("%s %s", a, b);
    }

    private static String formatLine(int n, double value) {
        String stringValue = new BigDecimal(value).setScale(9, BigDecimal.ROUND_HALF_UP).toString();
        if (n > 2) {
            return String.format("%s %-11s", n, stringValue);
        }
        int index = stringValue.length() - 1;
        while (stringValue.charAt(index) == '0' || stringValue.charAt(index) == '.') {
            --index;
        }
        return String.format("%s %-1s", n, stringValue.substring(0, index + 1));
    }

    private static double factorial(int n) {
        double result = 1.0;

        for (int i = 2; i <= n; ++i) {
            result *= i;
        }
        return result;
    }

    private static double formula(int n) {
        double result = 0.0;
        for (int i = 0; i <= n; ++i) {
            result += 1 / factorial(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(formatLine("n", "e"));
        System.out.println(formatLine("-", "-----------"));
        for (int i = 0; i <= N; ++i) {
            System.out.println(formatLine(i, formula(i)));
        }
    }
}
