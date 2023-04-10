package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String p = bufferedReader.readLine();
        String s = bufferedReader.readLine();
        int a = Integer.parseInt(p);
        int b = Integer.parseInt(s);
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
