package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String r = bufferedReader.readLine();


        int a = Integer.parseInt(r);

        if (a > 0 && a < 1000) {
            {
                if (a < 10 && a % 2 == 0) {
                    System.out.println("четное однозначное число");
                } else if (a >= 10 && a < 100 && a % 2 == 0) {
                    System.out.println("четное двузначное число");
                } else if (a >= 100 && a % 2 == 0) {
                    System.out.println("четное трехзначное число");
                } else if (a < 10 && a % 2 != 0) {
                    System.out.println("нечетное однозначное число");
                } else if (a >= 10 && a < 100 && a % 2 != 0) {
                    System.out.println("нечетное двузначное число");
                } else if (a >= 100 && a % 2 != 0) {
                    System.out.println("нечетное трехзначное число");
                }
            }

        }
    }
}
