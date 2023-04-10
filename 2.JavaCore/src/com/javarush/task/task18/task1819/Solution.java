package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        FileInputStream inputStream1 = new FileInputStream(fileName1);
        FileInputStream inputStream2 = new FileInputStream(fileName2);
        byte[] buffer1 = new byte[inputStream1.available()];
        byte[] buffer2 = new byte[inputStream2.available()];
        //читаем весь файл одним куском
        while (inputStream1.available() > 0) {
            inputStream1.read(buffer1);
        }

        FileOutputStream outputStream1 = new FileOutputStream(fileName1);
        while (inputStream2.available() > 0) {
            inputStream2.read(buffer2);
            outputStream1.write(buffer2);
            outputStream1.write(buffer1);
        }
        outputStream1.close();

        inputStream1.close();
        inputStream2.close();
    }
}