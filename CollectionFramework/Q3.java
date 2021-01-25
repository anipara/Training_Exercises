package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);  
        ListIterator<Integer> numbersIterator = numbers.listIterator(numbers.size());
        while(numbersIterator.hasPrevious()){
            System.out.println(numbersIterator.previous());
        }
    }
}
