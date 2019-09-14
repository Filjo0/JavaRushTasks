package com.javarush.task.task07.task0717;

import javax.lang.model.type.ArrayType;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);
        for (String s : result) {
                System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {

        for (int i = 0; i < list.size(); ) {
            list.add(i + 1, list.get(i));
            i = i + 2;
        }

        //напишите тут ваш код
        return list;

    }
}
