package org.example;

import java.util.ArrayList;
import java.util.List;

public class WordsService {

    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'y'}; // list of vowels letters

    private WordsService wordsService;

    public WordsService() {
        this.wordsService = wordsService;
    }


    /*
    все негласные буквы до гласной добавить в массив,
    гласную добавить в массив
    до следующей гласной />      %Vo% + Vo% + Vo% + Vo% ...
     */
    public List<String> makeWordDividedBySyllable(String word) { // возвращает первый слог
        List<String> wordDividedBySyllable = new ArrayList<>();
        String str = word.toLowerCase();
        char[] ch = str.toCharArray();
        if (ch.length == 0) return wordDividedBySyllable;
        for (int i = 0; i < word.length(); i++) { // loop with all word
            StringBuilder syllable = new StringBuilder();
            while (!checkVowel(ch[i]) && i != word.length() - 1) { // если не гласная и не последняя буква
                syllable.append(ch[i]); // add NO-VOWELS litter to current syllable
                i++;
            }   // possibilities -> po ssi bi li ti es
            syllable.append(ch[i]); // add VOWELS litter to current syllable
            // надо глянуть есть ли дальше еще гласные буквы...
            if(i!=word.length()-1){
                String checkLastLitter = word.substring(i+1,word.length()); // проверка есть ли далее в слове гласные
                if (checkContainsAnyVowel(checkLastLitter)){
                    wordDividedBySyllable.add(syllable.toString());
                }
                else {
                    syllable.append(checkLastLitter);
                    wordDividedBySyllable.add(syllable.toString());  // добавить все
                }
            }
        }
        return wordDividedBySyllable;
    }

    private boolean checkVowel(char ch) {
        for (char vowelsChar : VOWELS) {
            if (vowelsChar == ch) return true;
        }
        return false;
    }

    private static boolean checkContainsAnyVowel(String word) {
        for (char letter : word.toCharArray()) {
            for (char vowels : VOWELS) {
                if (vowels == letter) return true;
            }
        }
        return false;
    }


}
