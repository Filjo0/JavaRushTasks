package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String p = bufferedReader.readLine();
        int number = Integer.parseInt(p);
        while (number != 0) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

                number = number / 10;
            }
                System.out.println("Even: " + even + " Odd: " + odd);
                //напишите тут ваш код
            }
        }