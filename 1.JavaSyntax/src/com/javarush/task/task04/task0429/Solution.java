package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String p = bufferedReader.readLine();
        String q = bufferedReader.readLine();
        String r = bufferedReader.readLine();

        int a = Integer.parseInt(p);
        int b = Integer.parseInt(q);
        int c = Integer.parseInt(r);
        int d = 0;
        int e = 0;
        if (a > 0) {
            d++;
        }
        if (a < 0) {
            e++;
        }
        if (b > 0) {
            d++;
        }
        if (b < 0) {
            e++;
        }
        if (c > 0) {
            d++;
        }
        if (c < 0) {
            e++;
        }
        System.out.println("количество отрицательных чисел: " + e);
        System.out.println("количество положительных чисел: " + d);

    }
}
