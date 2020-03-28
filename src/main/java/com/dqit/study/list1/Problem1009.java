package com.dqit.study.list1;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/28 21:19
 * @Description
 */
public class Problem1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int m = sc.nextInt();
            int n = sc.nextInt();

            if(m == -1 && n == -1){
                break;
            }
            List<Pair<Integer , Integer>> roomList = new ArrayList<>();

            for(int i = 0 ;i < n; ++i){
                int receive = sc.nextInt();
                int give = sc.nextInt();

                roomList.add(new Pair<>(receive,give));
            }

            roomList.sort((a, b) -> {
                double ratioA = ((double)a.getKey()) / ((double)a.getValue());
                double ratioB = ((double)b.getKey()) / ((double)b.getValue());

                return Double.compare(ratioB, ratioA);
            });

            int index = 0 ;
            double result = 0.0 ;
            while(m != 0 && index < roomList.size()){
                int give = roomList.get(index).getValue();
                int receive = roomList.get(index).getKey();

                if(give <= m ){
                    result += new Double(receive);
                    m -= give;
                }else {
                    double ratio = ((double) m) / ((double) give) ;
                    double couldReceive = ratio * receive;

                    result += couldReceive;
                    m = 0;
                }
                ++index ;
            }

            System.out.printf("%.03f",result);
            System.out.println();
        }
    }
}
