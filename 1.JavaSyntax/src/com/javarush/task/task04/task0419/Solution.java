package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        int l = Integer.parseInt(p);
        String q = bufferedReader.readLine();
        int m = Integer.parseInt(q);
        String r = bufferedReader.readLine();
        int n = Integer.parseInt(r);
        String s = bufferedReader.readLine();
        int o = Integer.parseInt(s);
        if (l > m && l > n && l > o) {
            System.out.println(l);
        } else if (m > l && m > n && m > o) {
            System.out.println(m);

        } else if (n > l && n > m && n > o) {
            System.out.println(n);
        } else if (o > l && o > m && o > n) {
            System.out.println(o);
        } else if (m == n && m == l && m == o) {
            System.out.println(m);
        } else {
            System.out.println(Math.max(Math.max(l, m), Math.max(n, o)));
        }
    }
}
