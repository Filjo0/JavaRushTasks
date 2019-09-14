package com.javarush.task.task06.task0622;



/* 
Числа по возрастанию
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}