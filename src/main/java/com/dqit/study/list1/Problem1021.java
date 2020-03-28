package com.dqit.study.list1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 21:16
 * @Description
 */
public class Problem1021 {
    private static Scanner sc = new Scanner(System.in);

    private static List<Integer> init(int n){
        List<Integer> result = new LinkedList<Integer>();
        result.add(1);
        result.add(2);

        for(int i = 2; i <= n ; ++ i){
            int a = result.get(i - 1);
            int b = result.get(i - 2);
            result.add((a + b ) % 3);
        }
        return result;
    }

    public static void main(String[] args) {
        final int N = 8;
        List<Integer> checkRange = init(N);

        while (sc.hasNext()){
            int n = sc.nextInt();
            if(checkRange.get(n % N ) == 0){
                System.out.println("yes");
                continue;
            }
            System.out.println("no");
        }
    }
}
