package com.dqit.study.list1;

import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/28 21:20
 * @Description
 */
public class Problem1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while(n -- > 0 ){
            String line = scanner.next();
            char[] charArray = line.toCharArray();
            int length = 1 ;

            for(int i = 1 ; i<= line.length(); ++i ){
                if(i != line.length() && charArray[i] == charArray[i-1]){
                    ++length;
                    continue;
                }
                if(length > 1){
                    System.out.printf("%d%c" , length , charArray[i-1]);
                    length = 1;
                }else {
                    System.out.printf("%c" , charArray[i - 1]);
                }
            }
            System.out.println();
        }
    }
}
