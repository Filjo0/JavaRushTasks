package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        int[] numbers = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
            numbers[i] = Integer.parseInt(array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

