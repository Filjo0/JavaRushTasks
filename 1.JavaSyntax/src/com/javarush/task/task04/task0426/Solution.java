package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
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

        String r = bufferedReader.readLine();


        int a = Integer.parseInt(r);

        if (a > 0 && a % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (a > 0) {
            System.out.println("положительное нечетное число");
        } else if (a < 0 && a % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (a < 0) {
            System.out.println("отрицательное нечетное число");
        } else {
            System.out.print("ноль");
        }
    }
}
