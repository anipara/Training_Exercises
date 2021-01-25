package Lambda;

import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("himmy");
        words.add("ease");
        words.add("low");
        words.add("light");
        words.add("orange");
        StringBuilder str = new StringBuilder();
        words.forEach(word -> str.append(word.charAt(0)));
        System.out.println(str);
    }
}
