package com.javarush.task.task04.task0441;


/* 
Как-то средненько
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
        int a = Integer.parseInt(p);
        String q = bufferedReader.readLine();
        int b = Integer.parseInt(q);
        String r = bufferedReader.readLine();
        int c = Integer.parseInt(r);

        System.out.println((a + b + c - Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c)));
    }
}
