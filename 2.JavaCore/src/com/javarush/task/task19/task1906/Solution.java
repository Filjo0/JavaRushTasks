package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        FileReader reader = new FileReader(fileName1);
        FileWriter writer = new FileWriter(fileName2);

        int even = 1;

        while (reader.ready()) //пока остались непрочитанные байты
        {
            int data = reader.read(); //прочитать очередной байт
            if (even % 2 == 0) {
                writer.write(data);
            }
            even++;

        }
        bufferedReader.close();
        reader.close();
        writer.close();
        // закрываем поток


    }
}
