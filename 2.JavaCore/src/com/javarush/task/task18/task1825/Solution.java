package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        ArrayList<String> list = new ArrayList<>();
        try {
            while (!fileName.equals("end")) {
                fileName = reader.readLine();
                list.add(fileName);
            }
        } catch (IOException e) {
        }

        Collections.sort(list); // Сортировка имен частей
        fileName = list.get(0).substring(0, list.get(0).lastIndexOf(".")); // Формирование имени основного файла
        int byteBuffer;
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName))) {
            for (String s : list) {
                try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(s))) {
                    while ((byteBuffer = in.read()) != -1) {
                        out.write(byteBuffer);
                    }
                } catch (IOException e) {
                }
            }
        } catch (IOException e) {
        }
    }
}