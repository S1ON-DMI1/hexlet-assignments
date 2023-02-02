package exercise;

import java.util.List;
import java.util.ArrayList;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println(App.scrabble("rkqodlw", "woRld"));
        System.out.println(App.scrabble("begsdhhtsexoult", "Hexlet"));
        System.out.println(App.scrabble("ajv", "java"));
        System.out.println(App.scrabble("avjafff", "JaVa"));
        System.out.println(App.scrabble("", "hexlet"));

    }
    public static boolean scrabble(String symbol, String word) {
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < symbol.length(); i++) {
            characterList.add(symbol.toLowerCase().charAt(i));
        }

        List<Character> wordList = new ArrayList<>();
        for (int j = 0; j < word.length(); j++) {
            wordList.add(word.toLowerCase().charAt(j));
        }

        int x = 0;
        int counter = 0;
        while(x < wordList.size()) {
            if (characterList.contains(wordList.get(x))) {
                characterList.remove((wordList.get(x)));
                counter++;
            }
            x++;
        }
        return counter == wordList.size();
    }

}
//END
