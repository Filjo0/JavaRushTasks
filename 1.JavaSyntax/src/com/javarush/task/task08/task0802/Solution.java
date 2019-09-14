package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import sun.awt.SunHints;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Map<String, String> map = new HashMap<String, String>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");


        for(Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
        Map<String, Integer> hashMap = new HashMap<>();

// Помещаем данные на карточку
        hashMap.put("Васька", 5);
        hashMap.put("Мурзик", 8);
        hashMap.put("Рыжик", 12);
        hashMap.put("Барсик", 5);

// Получаем набор элементов
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

// Отобразим набор
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

// Добавляем значение
        int value = hashMap.get("Рыжик");
        hashMap.put("Рыжик", value + 3);
        int i = hashMap.get("Рыжик");
        System.out.println("У Рыжика стало " + hashMap.get("Рыжик"));


    }
}
