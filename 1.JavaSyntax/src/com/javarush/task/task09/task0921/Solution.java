package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
*/

public class Solution {


    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        try {
            while (true) {
                int num = Integer.parseInt(reader.readLine());
                list.add(num);
            }

        } catch (Exception e) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));

            }
        }
    }
}
//напишите тут ваш код
