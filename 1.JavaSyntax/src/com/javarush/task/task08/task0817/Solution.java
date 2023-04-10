package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i + " ", String.valueOf(i));
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map); // создаём копию массива
        for (Map.Entry<String, String> pair : copy.entrySet()) {          // итератор ?
            int frequency = Collections.frequency(copy.values(), pair.getValue());  // применяем метод Collections.frequency, находит повторения в виде числа > 1
            if (frequency > 1) {
                removeItemFromMapByValue(map, pair.getValue()); // если такие имеются то передаём в метод для удаления.
            }
        }
    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
