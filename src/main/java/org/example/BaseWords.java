package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BaseWords {

    private BaseWords baseWords;

    public BaseWords() {
        this.baseWords = baseWords;
    }

    Map<String, String> vocabulary = new HashMap<>() {{
        put("возможности", "possibilities");
        put("публикации", "publication");
    }};

    public String[] toQuestion() {
        // достать любой существующий ключ
        Object[] randomPara = vocabulary.keySet().toArray();
        Object key  = randomPara[new Random().nextInt(randomPara.length)];
        key.toString();

        String[] array = new String[2];
        array[0] = key.toString();
        array[1] = vocabulary.get(key);
        return array;
    }


}
