package Lambda;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("jimmy");
        words.add("cheese");
        words.add("Basketball");
        words.add("red");
        words.add("ball");
        words.removeIf(word -> word.length()%2==1);
        System.out.println(words);
    }
}
