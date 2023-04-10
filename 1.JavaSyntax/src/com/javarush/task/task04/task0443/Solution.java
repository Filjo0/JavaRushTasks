package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();

        String r = bufferedReader.readLine();
        int y = Integer.parseInt(r);
        String q = bufferedReader.readLine();
        int m = Integer.parseInt(q);
        String p = bufferedReader.readLine();
        int d = Integer.parseInt(p);


        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
