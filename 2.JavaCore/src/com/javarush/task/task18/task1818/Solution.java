package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();

        FileOutputStream outputStream1 = new FileOutputStream(fileName1);
        FileInputStream inputStream2 = new FileInputStream(fileName2);
        FileInputStream inputStream3 = new FileInputStream(fileName3);

        if (inputStream2.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream2.available()];
            int count = inputStream2.read(buffer);
            outputStream1.write(buffer, 0, count);
        }

        if (inputStream3.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream3.available()];
            int count = inputStream3.read(buffer);
            outputStream1.write(buffer, 0, count);
        }


        inputStream2.close();
        inputStream3.close();
        outputStream1.close();
    }
}
