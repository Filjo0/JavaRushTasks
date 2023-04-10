package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;


    public static void main(String[] args) throws Exception {
        Solution.strings = new ArrayList<>();
        int min = Integer.MIN_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() >= min) {
                min = strings.get(i).length();
            }
        }

        for (String string : strings) {
            if (min == string.length()) {
                System.out.println(string);
            }

        }
    }
}