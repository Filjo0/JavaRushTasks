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
        TreeMap<String, Double> m = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] s = line.split(" ");
                double value = Double.parseDouble(s[1]);
                m.merge(s[0], value, Double::sum);
            }
        }

        m.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
