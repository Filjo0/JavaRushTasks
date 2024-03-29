package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> m = new TreeMap<>();

        while (reader.ready()) {
            String[] s = reader.readLine().split(" ");
            if (m.containsKey(s[0])) {
                m.put(s[0], m.get(s[0]) + Double.parseDouble(s[1]));
            } else m.put(s[0], Double.parseDouble(s[1]));
        }

        m.forEach((key, value) -> System.out.println(key + " " + value));
        reader.close();
    }
}
