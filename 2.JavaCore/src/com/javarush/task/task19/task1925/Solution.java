package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0])); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))) {
            String line;
            boolean first = true;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > 6) {
                        if (!first) {
                            bufferedWriter.write(",");
                        }
                        bufferedWriter.write(word);
                        first = false;
                    }
                }
            }
        }
    }
}
