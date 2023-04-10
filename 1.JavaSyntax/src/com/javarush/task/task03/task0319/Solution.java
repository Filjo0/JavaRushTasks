package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
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
        String sAge = bufferedReader.readLine();
        String qAge = bufferedReader.readLine();


        int rAge = Integer.parseInt(sAge);
        int nAge = Integer.parseInt(qAge);

        System.out.println(name + " получает " + rAge + " через " + nAge + " лет.");
    }
}
