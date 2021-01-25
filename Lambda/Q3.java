package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q3 {
    public static void main(String[] args) {
        Consumer<Integer> consume = (x) -> System.out.println(x*2);
        consume.accept(10);

        Supplier<String> supply = () -> "You have been supplied";
        String res = supply.get();
        System.out.println(res);

        Predicate<Integer> tester = (x) -> x > 10;
        System.out.println(tester.test(1));

        Function<String, String> func = (str) -> str + str;
        System.out.println(func.apply("hello"));
    }
}
