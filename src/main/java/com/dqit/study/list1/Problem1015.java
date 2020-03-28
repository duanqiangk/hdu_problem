package com.dqit.study.list1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/28 21:20
 * @Description
 */
public class Problem1015 {
    public static boolean[] vis = new boolean[27];
    public static boolean finded = false;

    public static char[] init(String charPool){
        finded = false;
        for(int i = 0 ; i < vis.length ; ++i ){
            vis[i] = false;
        }

        char[] chars = charPool.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder(new String(chars));
        return stringBuilder.reverse().toString().toCharArray();
    }

    public static int getResultNum(String line){
        double result = 0 ;
        int pow = 1 ;
        for(int i = 0 ; i < line.length() ; ++i){
            int c = line.charAt(i) - 'A' + 1;
            double temp = Math.pow(c , pow);
            int navi = -1 ;
            if(pow % 2 == 1){
                navi = 1;
            }
            result += navi * temp;
            ++pow;
        }
        return (int)result;
    }

    public static void dfs(int targetNum , char[] charPool , String choose ){
        if(choose.length() > 5 || finded ){
            return;
        }

        if(choose.length() == 5 && getResultNum(choose) == targetNum){
            System.out.println(choose);
            finded = true;
            return;
        }

        for(int i = 0 ; i < charPool.length ; ++i ){
            int charIndex = charPool[i] - 'A' ;
            if(!vis[charIndex]){
                vis[charIndex] = true ;
                dfs(targetNum , charPool , choose + charPool[i]);
                vis[charIndex] = false;

                if(finded){
                    return ;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int targetNum = sc.nextInt();
            String charPool = sc.next();
            if(targetNum == 0 && charPool.trim().equals("END")){
                return;
            }

            char[] charArrayPool = init(charPool);
            dfs(targetNum , charArrayPool , "");
            if(! finded){
                System.out.println("no solution");
            }
        }
    }
}
