package com.javarush.task.task14.task1409;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        if (bridge instanceof SuspensionBridge) {
            bridge = new SuspensionBridge();
            System.out.println(bridge.getCarsCount());
        } else if (bridge instanceof WaterBridge) {
            bridge = new WaterBridge();
            System.out.println(bridge.getCarsCount());
        }
    }
    //add println method here
}

