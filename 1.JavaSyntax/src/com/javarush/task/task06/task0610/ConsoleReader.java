package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();
        return s;
        //напишите тут ваш код

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String p = bufferedReader.readLine();
        int number = Integer.parseInt(p);
        return number;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String q = bufferedReader.readLine();
        double num = Double.parseDouble(q);
        return num;

    }

    public static boolean readBoolean() throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String u = bufferedReader.readLine();
        boolean a = Boolean.parseBoolean(u);
        return a;    //напишите тут ваш код


    }

    public static void main(String[] args) {

    }
}
