package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BaseWords {
    Map<String, String> vocabulary = new HashMap<>() {{
        put("карта", "map");
        put("яблоко", "apple");
        put("платить", "pay");
        put("возможности", "possibilities");
        put("публикации", "publication");
    }};

    public String[] toQuestion() {
        // достать любой существующий ключ
        String[] randomPair = vocabulary.keySet().toArray(new String[0]); // все ключи HashMap коллекции vocabulary в массив

        String key  = randomPair[new Random().nextInt(randomPair.length)];
        System.out.println("!!!" + key);
        String[] array = new String[2];
        array[0] = key.toString();
        array[1] = vocabulary.get(key);
        return array;
    }


}
