package com.javarush.task.task04.task0413;

/* 
День недели
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

        String s = bufferedReader.readLine();
        int n = Integer.parseInt(s);
        if (n == 1) {
            System.out.println("понедельник");
        } else if (n == 2) {
            System.out.println("вторник");
        } else if (n == 3) {
            System.out.println("среда");
        } else if (n == 4) {
            System.out.println("четверг");
        } else if (n == 5) {
            System.out.println("пятница");
        } else if (n == 6) {
            System.out.println("суббота");
        } else if (n == 7) {
            System.out.println("воскресенье");
        } else {
            System.out.println("такого дня недели не существует");
        }
    }
}