package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
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

        String q = bufferedReader.readLine();
        String p = bufferedReader.readLine();

        int a = Integer.parseInt(p);
        int b = 0;

        while (b < a) {

            System.out.println(q);
            a--;
        }
    }
}
