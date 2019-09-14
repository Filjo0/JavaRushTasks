package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String r = bufferedReader.readLine();
        String s = bufferedReader.readLine();//

        int a = Integer.parseInt(r);
        int b = Integer.parseInt(s);

        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b > 0) {
            System.out.println(2);
        } else if (a <0 && b < 0) {
            System.out.println(3);
        }
        else if (a > 0 && b < 0) {
            System.out.print(4);
        }
    }
}    //напишите тут ваш код
