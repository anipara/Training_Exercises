package Lambda;

import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("himmy");
        words.add("ease");
        words.add("low");
        words.add("light");
        words.add("orange");
        words.replaceAll(word -> word.toUpperCase());
        System.out.println(words);
    }
}
