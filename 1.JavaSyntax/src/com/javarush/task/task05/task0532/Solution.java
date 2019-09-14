package com.javarush.task.task05.task0532;

        import java.io.*;

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();

        int num = Integer.parseInt(s);
        int maximum = Integer.MIN_VALUE;

        for (int a = 0; a < num; a++) {
            String p = bufferedReader.readLine();
            int number = Integer.parseInt(p);
            if (number > maximum)
                maximum = number;

        }

            //напишите тут ваш код
            System.out.println(maximum);
        }
    }

