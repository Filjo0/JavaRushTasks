package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        ArrayList<Character> list = new ArrayList<>();

        int count = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add((char) (byte) data);
            if (data == ' ') {
                count++;
            }
        }


        System.out.println(Math.round((double) count / list.size() * 100 * 100.0) / 100.0);
        inputStream.close();
    }
}