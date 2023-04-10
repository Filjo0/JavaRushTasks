package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();


        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        bufferedReader.close();

        Pattern seeking = Pattern.compile("\\b[0-9]+\\b");
        while (reader.ready()) {
            String str = reader.readLine();
            Matcher matcher = seeking.matcher(str);
            while (matcher.find()) {
                writer.write(str.substring(matcher.start(), matcher.end()) + " ");

            }


            reader.close();
            writer.close();

        }
    }
}
