package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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
        if (a <= b && b <= c) {
            System.out.println(c + " " + b + " " + a);
        } else if (a <= c && c <= b) {
            System.out.println(b + " " + c + " " + a);
        } else if (b <= a && a <= c) {
            System.out.println(c + " " + a + " " + b);
        } else if (b <= c) {
            System.out.println(a + " " + c + " " + b);
        } else if (a <= b) {
            System.out.println(b + " " + a + " " + c);
        } else {
            System.out.println(a + " " + b + " " + c);
        }
    }
}