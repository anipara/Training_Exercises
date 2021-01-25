package Lambda;

public class Q1 {
    public static void main(String[] args) {
        Operations add = (a,b) -> a+b; 
        Operations sub = (a,b) -> a-b; 
        Operations multiply = (a,b) -> a*b; 
        Operations divide = (a,b) -> a/b; 

        System.out.println(add.operation(10, 20));
        System.out.println(sub.operation(10, 20));
        System.out.println(multiply.operation(10, 20));
        System.out.println(divide.operation(10, 20));
    }
}

interface Operations{
    int operation(int a, int b);
}
