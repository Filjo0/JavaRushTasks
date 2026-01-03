package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0])); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.matches(".*[0-9]+.*")) {
                        bufferedWriter.write(word);
                        bufferedWriter.write(' ');
                    }
                }
            }
        }
    }
}
