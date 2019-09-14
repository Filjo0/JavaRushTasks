package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        String N = reader.readLine();
        String M = reader.readLine();
        int l = Integer.parseInt(M);

        for (int i = Integer.parseInt(N); i > 0; i--) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int k = 0; k < l; k++) {
            String a = list.get(0);
            list.remove(a);
            list.add(list.size(), a);
        }
        for (int k = 0; k < list.size(); k++){
            System.out.println(list.get(k));
        }
    }
}
