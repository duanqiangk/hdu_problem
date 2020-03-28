package com.dqit.study.list1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 17:22
 * @Description
 */
public class Problem1004 {
    private static Scanner sc = new Scanner(System.in);

    private static void putInMap(Map<String , Integer> colorMap , String color){
        if(colorMap.containsKey(color)){
            colorMap.put(color , colorMap.get(color) + 1);
            return;
        }
        colorMap.put(color , 1);
    }

    public static void main(String[] args) {
        while (sc.hasNext()){
            int n = sc.nextInt();
            int maxCount = 0 ;
            String maxColor = "";
            Map<String, Integer> colorMap = new HashMap<String, Integer>();

            if(n == 0 ){
                return;
            }

            for(int i = 0 ; i < n ; ++i ){
                String color = sc.next();
                putInMap(colorMap , color);
                if( colorMap.get(color) > maxCount){
                    maxColor = color;
                    maxCount = colorMap.get(color);
                }
            }

            System.out.println(maxColor);
        }
    }
}
