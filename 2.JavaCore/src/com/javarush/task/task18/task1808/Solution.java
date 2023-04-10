package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream fileOutputStream2 = new FileOutputStream(reader.readLine());

        //обработка данных
        int a = inputStream.available();
        byte[] buffer = new byte[a];
        int count = inputStream.read(buffer);

        //записи по файлам

        if (count % 2 == 0) {
            fileOutputStream1.write(buffer, 0, count / 2);
            fileOutputStream2.write(buffer, count / 2, count / 2);
        } else {
            fileOutputStream1.write(buffer, 0, count / 2 + 1);
            fileOutputStream2.write(buffer, count / 2 + 1, count / 2);
        }

        //конечное освобождение памяти
        inputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}
