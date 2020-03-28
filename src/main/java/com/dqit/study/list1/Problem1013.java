package com.dqit.study.list1;

import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 19:43
 * @Description
 */
public class Problem1013 {
    private static Scanner sc = new Scanner(System.in);

    private static String digitalRoot(String digital){
        if(digital.length() <= 1){
            return digital;
        }
        int sum = 0 ;
        for(int i = 0 ; i < digital.length(); ++i ){
            sum += (digital.charAt(i) - '0');
        }
        return digitalRoot(Integer.toString(sum));
    }

    public static void main(String[] args) {
        while (sc.hasNext()){
            String line = sc.next();

            if("0".equals(line.trim())){
                return;
            }
            System.out.println(digitalRoot(line));
        }
    }
}
