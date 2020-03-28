package com.dqit.study.list1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 16:40
 * @Description
 */
public class Problem1002 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int inputCount = sc.nextInt();

        for (int i = 1; i <= inputCount; ++i) {
            BigDecimal a = new BigDecimal(sc.next());
            BigDecimal b = new BigDecimal(sc.next());

            System.out.println(String.format("Case %s:", i));
            System.out.println(String.format("%s + %s = %s", a, b, a.add(b)));
            if (i < inputCount) {
                System.out.println();
            }
        }
    }
}
