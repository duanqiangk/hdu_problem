package com.dqit.study.list1;

import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/28 21:20
 * @Description
 */
public class Problem1018 {
    /**
     * 数学求解
     */
    public static void method1(){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t -- != 0 ){
            int n = scanner.nextInt();
            double res = 1 ;

            for(int i = 1 ; i <= n ; ++i ){
                res += Math.log10(i);
            }
            System.out.println((int)res);
        }
    }

    /**
     * 斯特林公式
     */
    public static void method2(){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t -- > 0 ){
            int n = scanner.nextInt();

            int res = (int)(0.5 * Math.log10(2 * Math.PI * n ) + n * Math.log10(n / Math.E)) + 1;
            System.out.println(res);
        }
    }
    public static void main(String[] args) {
        method2();
    }
}
