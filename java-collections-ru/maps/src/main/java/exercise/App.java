package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
    class App {
    public static void main(String[] args) {
        System.out.println(App.toString(App.getWordCount("the java is the best programming language java")));
//        (App.toString(App.getWordCount("java is the best programming language java")));
    }
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] text = sentence.split(" ");

        Map<String, Integer> textMap = new HashMap<>();

        if (sentence.isEmpty()) {
            return (textMap);
        }
        for (int i = 0; i < text.length; i++) {
            textMap.put(text[i], 0);
        }
        for (int i = 0; i < text.length; i++) {
            for (String s : textMap.keySet()) {
                if (s.equals(text[i])) {
                    textMap.put(s, textMap.get(s) + 1);
                }
            }
        }
        return textMap;
    }

        public static String toString(Map<String, Integer> words) {

            if(words.isEmpty()) {
                return ("{}");
            }
            StringBuilder text2 = new StringBuilder("{\n");

            for(Map.Entry<String, Integer> word: words.entrySet()) {
                text2.append("  " + word.getKey() + ": " + word.getValue() + "\n");
            }
            text2.append("}");
            return text2.toString();
        }
    }
//END
