package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String age = bufferedReader.readLine();//
        int a = Integer.parseInt(age);
        if (a > 20) {
            System.out.print("");
            System.out.println("И 18-ти достаточно");
        }

        // напишите тут ваш код
    }
}
//напишите тут ваш код