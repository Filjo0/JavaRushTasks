package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double t = Double.parseDouble(s);

        while (true) {
            if (t < 3) {
                System.out.println("зелёный");
                break;
            } else if (t >= 3 && t < 4) {
                System.out.println("жёлтый");
                break;

            } else if (t >= 4 && t < 5) {
                System.out.println("красный");
                break;
            }
            t = t - 5;
        }
    }
}