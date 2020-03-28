package com.dqit.study.list1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/28 21:20
 * @Description
 */
public class Problem1016 {
    /**
     * 判断是否是素数（素数特性： 大于5的素数总是==6x + 1 或者 6x - 1）
     *
     * @param num 参数
     * @return 结果
     */
    public static boolean isPrime (int num){
        if( num <= 3 ){
            return num >= 1;
        }
        //抛出6x+1和6x-1以外的数字
        if(num % 6 != 1 && num % 6 != 5){
            return false ;
        }

        //对上一步刨除掉之后的所有选中的数字做判断
        int sqrt = (int) Math.sqrt(num);
        for(int i = 5 ; i <= sqrt ; i += 6){
            if(num % i == 0 || num % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }

    public static void printResult(List<Integer> list){
        System.out.print(list.get(0));
        for(int i = 1 ; i < list.size() ; ++i ){
            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }

    public static boolean[] vis ;

    public static void init(int n ){
        vis = new boolean[n + 1];
        for(int i = 0 ; i< n ; ++ i ){
            vis[i] = false;
        }
    }

    public static void dfs(int n , LinkedList<Integer> list , int index){
        vis[index] = true;
        list.add(index);
        if(list.size() == n && isPrime( list.getLast() + list.getFirst())){
            printResult(list);
            list.removeLast();
            vis[index] = false;
            return;
        }

        for(int i = 1 ; i <= n ; ++i){
            if(!vis[i] && isPrime(i + index )){
                dfs(n , list , i);
            }
        }
        list.removeLast();
        vis[index] = false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = 1 ;
        while(sc.hasNext()){
            int n = sc.nextInt();

            init(n);
            System.out.println("Case " + (cases) + ":");
            dfs(n , new LinkedList<>() , 1);
            ++cases;
            System.out.println();
        }
    }

}
