package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String p = bufferedReader.readLine();
        int m = Integer.parseInt(p);    //напишите тут ваш код
        String q = bufferedReader.readLine();
        int n = Integer.parseInt(q);    //напишите тут ваш код
        String r = bufferedReader.readLine();
        int o = Integer.parseInt(r);    //напишите тут ваш код

        if (m + n > o && m + o > n && n + o > m) {
            System.out.println("Треугольник существует.");
        }
        else{
            System.out.println("Треугольник не существует.");
        }
    }
}