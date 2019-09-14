package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

        for (int i = 0; i < strings.size(); i++) {
            if (min == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }

        }
    }
}
//напишите тут ваш код
