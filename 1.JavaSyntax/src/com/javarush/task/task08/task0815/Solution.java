package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Surname" + i, "Name" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {

        int num = 0;
        for (String s : map.values()) {
            if (s.equals(name)) num++;
        }
        return num;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int num = 0;
        for (String s : map.keySet()) {
            if (s.equals(lastName)) num++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(createMap());
        System.out.println(getCountTheSameFirstName(createMap(), "Name7"));
    }
}
