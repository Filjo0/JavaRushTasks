package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

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
        int c = Integer.parseInt(r);//напишите тут ваш код
        int d = 0;
        if (a > 0) {
            d++;
        }
        if (b > 0) {
            d++;
        }
        if (c > 0){
            d++;
        }
        System.out.println(d);
        }

    }