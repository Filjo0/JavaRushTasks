package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        int min = list.get(0).length();
        int max = list.get(0).length();

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        for (String s : list) {
            if (s.length() == min) {
                System.out.println(s);
                break;
            }
            if (s.length() == max) {
                System.out.println(s);
                break;
            }
        }
    }
}