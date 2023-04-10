package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);

        byte[] buffer = new byte[inputStream.available()];// создаем массив размером в файл (кол. баит)
        int countBuffer = inputStream.read(buffer, 0, inputStream.available());
        for (int i = buffer.length - 1; i >= 0; i--) {
            outputStream.write(buffer[i]);
        }

        inputStream.close();
        outputStream.close();
    }
}