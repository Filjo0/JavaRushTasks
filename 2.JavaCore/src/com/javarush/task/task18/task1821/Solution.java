package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        HashMap<Character, Integer> map = new HashMap<>();


        while (inputStream.available() > 0) {
            Character data = (char) inputStream.read();
            if (map.containsKey(data)) {
                int val = map.get(data);
                map.put(data, val + 1);
            } else {
                map.put(data, 1);
            }
        }
        inputStream.close();

        List<Character> chars = new ArrayList(map.keySet());
        Collections.sort(chars);
        for (Character ch : chars) {
            System.out.println(ch + " " + map.get(ch));
        }
    }
}