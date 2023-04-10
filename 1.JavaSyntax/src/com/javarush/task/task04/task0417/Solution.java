package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        int m = Integer.parseInt(p);
        String q = bufferedReader.readLine();
        int n = Integer.parseInt(q);
        String r = bufferedReader.readLine();
        int o = Integer.parseInt(r);

        if (m == n && n == o) {
            System.out.println(m + " " + n + " " + o);
        } else if (m == o) {
            System.out.println(m + " " + o);
        } else if (n == o) {
            System.out.println(n + " " + o);
        } else if (m == n) {
            System.out.println(m + " " + n);
        }
    }
}