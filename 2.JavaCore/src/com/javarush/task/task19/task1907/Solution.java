package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        FileReader reader = new FileReader(fileName1);

        StringBuilder builder = new StringBuilder();

        while (reader.ready()) {
            builder.append((char) reader.read());
        }
        reader.close();

        String[] ss = builder.toString().split("(\\b|^)world(\\b|$)");
        System.out.println(ss.length - 1);
        bufferedReader.close();
    }
}
