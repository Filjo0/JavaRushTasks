package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String p = bufferedReader.readLine();
        String q = bufferedReader.readLine();//напишите тут ваш код
        if (p.equals(q)){
            System.out.println("Имена идентичны");
        }
        else if (p.length() == q.length()) {
            System.out.print("Длины имен равны");
        }
        }
        }