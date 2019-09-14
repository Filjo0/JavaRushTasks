package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        int n = Integer.parseInt(s);
        if (n > 0 && n <2) {
            System.out.println("понедельник");
        } else if (n > 1 && n < 3) {
            System.out.println("вторник");
        } else if (n > 2 && n < 4) {
            System.out.println("среда");
        } else if (n > 3 && n < 5) {
            System.out.println("четверг");
        } else if (n > 4 && n < 6) {
            System.out.println("пятница");
        } else if (n > 5 && n < 7) {
            System.out.println("суббота");
        } else if (n > 6 && n < 8) {
            System.out.println("воскресенье");
        } else if (n < 1 || n > 7) {
            System.out.println("такого дня недели не существует");
        }
    }
}