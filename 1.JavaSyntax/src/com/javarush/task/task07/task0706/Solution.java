package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[15];
        int even = 0;
        int odd = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            array[i] = Integer.parseInt(r.readLine());
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                even = array[i] + even;
            } else {
                odd = array[i] + odd;
            }
        }
        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
