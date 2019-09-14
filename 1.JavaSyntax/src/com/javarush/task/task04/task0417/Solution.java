package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String p = bufferedReader.readLine();
        int m = Integer.parseInt(p);    //напишите тут ваш код
        String q = bufferedReader.readLine();
        int n = Integer.parseInt(q);    //напишите тут ваш код
        String r = bufferedReader.readLine();
        int o = Integer.parseInt(r);    //напишите тут ваш код // напишите тут ваш код

        if (m == n && n == o) {
            System.out.println(m + " " + n + " " + o);
        } else if (m == o) {
            System.out.println(m + " " + o);
        } else if (n == o) {
            System.out.println(n + " " + o);
        } else if (m == n && m != o) {
            System.out.println(m + " " + n);
        }
    }
}