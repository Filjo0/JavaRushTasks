package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
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

        int m = Integer.parseInt(p);
        int n = Integer.parseInt(q);

        for (int i = 0; i < m; i++) {
            for (int z = 0; z < n; z++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}