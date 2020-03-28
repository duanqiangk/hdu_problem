package com.dqit.study.list1;

import java.util.Scanner;

/**
 * @Author qiang.duan
 * @Date 2020/3/27 18:41
 * @Description
 */
public class Problem1008 {
    private static Scanner sc = new Scanner(System.in);
    private static Integer MOVE_UP_TIME = 6;
    private static Integer MOVE_DOWN_TIME = 4;
    private static Integer STAY_TIME = 5;

    public static void main(String[] args) {
        while (sc.hasNext()) {
            int waitingFloor = sc.nextInt();
            if (waitingFloor == 0) {
                return;
            }

            int allTime = waitingFloor * STAY_TIME;
            int currentFloor = 0;
            for (int i = 0; i < waitingFloor; ++i) {
                int nextFloor = sc.nextInt();
                int floorChangeCount = Math.abs(nextFloor - currentFloor);
                int timeSpend = nextFloor > currentFloor ? MOVE_UP_TIME : MOVE_DOWN_TIME;
                currentFloor = nextFloor;
                allTime += floorChangeCount * timeSpend;
            }

            System.out.println(allTime);
        }
    }
}
