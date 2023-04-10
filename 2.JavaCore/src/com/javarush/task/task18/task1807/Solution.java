package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Byte> list = new ArrayList<>();

        int com = ',';
        int count = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == ',') {
                count++;
            }
        }
        System.out.println(count);

        inputStream.close();
    }
}
