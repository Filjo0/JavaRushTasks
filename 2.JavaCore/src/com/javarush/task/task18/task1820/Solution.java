package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        Scanner inputStream1 = new Scanner(new FileInputStream(fileName1));
        inputStream1.useLocale(Locale.ENGLISH);
        ArrayList<Float> list = new ArrayList<>();
        while (inputStream1.hasNext()) {
            list.add(inputStream1.nextFloat());

        }
        inputStream1.close();
        FileOutputStream outputStream = new FileOutputStream(fileName2);
        for (float number : list) {
            outputStream.write((Math.round(number) + " ").getBytes());

        }
        outputStream.close();
    }
}
