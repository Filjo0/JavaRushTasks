package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> vowel = new ArrayList<>();

        String s = reader.readLine();

        for (int i = 0; i < s.length(); i++) {
            //char c = inputData.charAt(i);
            if (s.charAt(i) == ' ') {
            } else if (isVowel(s.charAt(i))) {
                vowel.add(s.charAt(i) + " ");
            } else if (!isVowel(s.charAt(i))) {
                list.add(s.charAt(i) + " ");
            }
        }

        for (String x : vowel) {
            System.out.print(x);
        }

        System.out.println();

        for (String x : list) {
            System.out.print(x);
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}