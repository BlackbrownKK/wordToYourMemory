package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WordsService wordsService = new WordsService();
        BaseWords baseWords = new BaseWords();


        while (true){
            String[] str = baseWords.toQuestion(); // даст любую пару рус / анг
            String wordRus = str[0]; //  даст рус
            String wordEng = str[1]; //  даст анг
            System.out.println("переведи это: " + wordRus);
//            System.out.println(wordsService.makeWordDividedBySyllable(wordEng).get(0));
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if (answer.equals(wordEng)){
                System.out.println("All right");
            }
            else {
                System.out.println("Not right");
            }

        }
        // possibilities publication

//        for (String str: wordsService.makeWordDividedBySyllable(word)) {
//            System.out.println(str);

//        }

    }
}