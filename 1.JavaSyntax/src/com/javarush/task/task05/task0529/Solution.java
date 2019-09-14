package com.javarush.task.task05.task0529;


/* 
Консоль-копилка
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

        int a = 0;
        while (true) {
            String p = bufferedReader.readLine();
            if (p.equals("сумма")){
                break;
            }
            int number = Integer.parseInt(p);
            a = a + number;

        }
        System.out.println(a);

        //напишите тут ваш код
    }
}
