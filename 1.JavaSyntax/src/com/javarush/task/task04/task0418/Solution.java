package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String p = bufferedReader.readLine();
        int m = Integer.parseInt(p);
        String s = bufferedReader.readLine();
        int n = Integer.parseInt(s);
        if (m > n) {
            System.out.println(n);
        }
        else if (m < n) {
            System.out.println(m);
        }
        else
            System.out.println(m);
            //напишите тут ваш код   //напишите тут ваш код
        }
        }