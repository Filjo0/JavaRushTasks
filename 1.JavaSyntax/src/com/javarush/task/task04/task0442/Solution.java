package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int a = 0;
        while (true) {
            String p = bufferedReader.readLine();
            int number = Integer.parseInt(p);
            a = a + number;
            if (number == -1) {
                break;
            }

        }
        System.out.println(a);    //напишите тут ваш код
            }
    }
