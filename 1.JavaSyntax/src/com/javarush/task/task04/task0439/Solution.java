package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String q = bufferedReader.readLine();

        for (int a = 1; a < 11; a++) {
            System.out.println(q + " любит меня.");
        }
    }    //напишите тут ваш код

    }
