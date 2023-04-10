package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s == null || s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> list23 = new ArrayList<String>();

        for (String s : list) {

            if (s.length() % 2 == 0) {
                list23.add(s + " " + s);

            } else {
                list23.add(s + " " + s + " " + s);
            }
        }

        for (String s : list23) {
            System.out.println(s);
        }
    }
}
