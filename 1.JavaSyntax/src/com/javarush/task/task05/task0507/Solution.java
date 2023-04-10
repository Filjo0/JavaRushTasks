package com.javarush.task.task05.task0507;

/*
Среднее арифметическое
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

        double sum = 0;
        int count = 0;
        while (true) {
            String p = bufferedReader.readLine();
            int number = Integer.parseInt(p);
            if (number == -1) {
                break;
            } else {
                sum = number + sum;
                count++;
            }

        }
        System.out.println(sum / count);
    }
}