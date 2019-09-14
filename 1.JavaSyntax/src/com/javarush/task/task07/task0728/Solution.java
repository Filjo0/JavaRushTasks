package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int n = 0; n < array.length - 1; n++) {
            for (int k = 0; k < array.length - 1 - n; k++)
            if (array[k] < array[k + 1]) {
                int tmp = array[k];
                array[k] = array[k + 1];
                array[k + 1] = tmp;
            }


        }
    }
    //напишите тут ваш код
}
