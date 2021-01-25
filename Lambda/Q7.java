package Lambda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q7 {
    public static void main(String[] args) {
        Map<Integer, String> collage = new HashMap<>();
        collage.put(1, "first");
        collage.put(2,"second");
        collage.put(3,"third");

        StringBuilder str = new StringBuilder();
        Iterator iterator = collage.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator.next();
            str.append(entry.getKey().toString() + entry.getValue() + " ");
        }
        System.out.println(str);

    }
}
