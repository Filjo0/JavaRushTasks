package com.javarush.task.task04.task0422;

/* 
18+
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

        String name = bufferedReader.readLine();
        String age = bufferedReader.readLine();//
        int a = Integer.parseInt(age);
        if (a > 0) {
            if (a < 18) {
                System.out.print("Подрасти еще");
            }
            System.out.print("");
        }
    }
}
