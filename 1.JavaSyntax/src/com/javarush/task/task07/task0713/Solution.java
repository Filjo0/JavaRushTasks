package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> d3 = new ArrayList<>();
        ArrayList<Integer> d2 = new ArrayList<>();
        ArrayList<Integer> another = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer integer : list) {
            if (integer % 3 == 0) {
                d3.add(integer);
                if (integer % 2 == 0) {
                    d2.add(integer);
                }
            } else if (integer % 2 == 0) {
                d2.add(integer);
            } else
                another.add(integer);
        }

        printList(list);
        System.out.println();
        printList(d3);
        System.out.println();
        printList(d2);
        System.out.println();
        printList(another);
    }

    public static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
