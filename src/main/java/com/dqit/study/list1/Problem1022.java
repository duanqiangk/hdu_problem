package com.dqit.study.list1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/28 21:17
 * @Description
 */
public class Problem1022 {
    public static void doStack(int n , String trainIn , String trainOut){
        LinkedList<Character> station = new LinkedList<>();
        LinkedList<String> operateList = new LinkedList<>();
        int outIndex = 0 ;
        boolean isOk = false;

        for(int i = 0 ; i < trainIn.length(); ++i ){
            station.add(trainIn.charAt(i));
            operateList.add("in");

            if(station.size() > n){
                break;
            }
            while(!station.isEmpty() && station.getLast() == trainOut.charAt(outIndex)){
                station.removeLast();
                outIndex++ ;
                operateList.add("out");
            }
        }
        if(station.isEmpty()){
            isOk = true;
        }

        if(!isOk){
            System.out.println("No.");
        }else {
            System.out.println("Yes.");
            for(String opt : operateList){
                System.out.println(opt);
            }
        }
        System.out.println("FINISH");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            String trainIn = scanner.next();
            String trainOut = scanner.next();

            doStack(n , trainIn , trainOut);
        }
    }
}
