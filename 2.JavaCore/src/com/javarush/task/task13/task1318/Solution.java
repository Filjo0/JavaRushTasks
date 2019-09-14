package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(br.readLine());

        while (in.available() > 0) {

            System.out.print((char) in.read());
        }
        System.out.println(); // без этого не принимается
        br.close();
        in.close();  // напишите тут ваш код
    }
}