package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        int min1 = Integer.MAX_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
            if (list.get(i).length() <= min1) {
                min1 = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (min1 == list.get(i).length()) {
                System.out.println(list.get(i));
            }

        }
    }
}