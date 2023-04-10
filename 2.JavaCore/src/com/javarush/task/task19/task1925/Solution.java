package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            bufferedWriter = new BufferedWriter(new FileWriter(args[1]));

            StringBuilder sb = new StringBuilder();
            while (bufferedReader.ready()) {
                String[] line = bufferedReader.readLine().split(" ");
                for (String s : line) {
                    if (s.length() > 6) {
                        sb.append(s).append(",");
                    }
                }
            }
            bufferedWriter.write(sb.delete(sb.length() - 1, sb.length()).toString());
        }
        bufferedWriter.close();
    }
}