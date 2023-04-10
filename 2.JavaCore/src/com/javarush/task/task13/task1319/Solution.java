package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(br.readLine()));
        while (true) {
            String line = br.readLine();
            bw.write(line);
            bw.newLine();
            if (line.equals("exit")) break;
        }
        br.close();
        bw.close();  // напишите тут ваш код  // напишите тут ваш код
    }
}
