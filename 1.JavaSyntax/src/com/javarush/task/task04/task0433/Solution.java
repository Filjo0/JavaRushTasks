package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 1;
        while (a < 11) {
            int b = 1;
            while (b < 11) {
                System.out.print("S");
                b++;
            }
            System.out.println();
            a++;
        }
    }

}
