package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        int n = Integer.parseInt(s);
        if (n > 0) {
            System.out.println(n * 2);
        } else if (n < 0) {
            System.out.println(n + 1);
        } else {
            System.out.println(0);
        }
    }
        }
        //читаем строку с клавиатуры

        //напишите тут ваш код

