package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;


public class Qs {
    public static void main(String[] args) {

        Trader joe = new Trader("joe", "Delhi");
        Trader bob = new Trader("bob", "Indore");
        Trader alice = new Trader("alice", "Delhi");
        Trader raj = new Trader("raj", "Pune");
        Trader shawn = new Trader("bhawn", "Pune");
        Trader pop = new Trader("pop", "Delhi");
        ArrayList<Trader> traders = new ArrayList<>();
        traders.add(joe);
        traders.add(bob);
        traders.add(alice);
        traders.add(raj);
        traders.add(shawn);
        traders.add(pop);


        Transaction t1 = new Transaction(joe , 1990, 100);
        Transaction t2 = new Transaction(bob, 2011, 250);
        Transaction t3 = new Transaction(joe, 2011, 60);
        Transaction t4 = new Transaction(alice, 2020, 500);
        Transaction t5 = new Transaction(pop, 2011, 40);
        Transaction t6 = new Transaction(joe, 1988, 10);
        Transaction t7 = new Transaction(shawn, 2002, 80);
        Transaction t8 = new Transaction(raj, 2008, 30);
        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(t1);
        transactions.add(t2);
        transactions.add(t3);
        transactions.add(t4);
        transactions.add(t5);
        transactions.add(t6);
        transactions.add(t7);
        transactions.add(t8);



        ArrayList<News> newsList = new ArrayList<>();
        News n1 = new News("Jack", "Welcome to our budget page", 3, 1);
        News n2 = new News("Bill", "Have you seen", 7, 2);
        News n3 = new News("Adam", "budget cuts happening", 6, 3);
        News n4 = new News("Jack", "Cheese is the best", 9, 4);
        News n5 = new News("Jack", "budget budget budget", 3, 5);
        News n6 = new News("Stacey", "Wilc animals loose in the park", 1, 6);
        newsList.add(n1);
        newsList.add(n2);
        newsList.add(n3);
        newsList.add(n4);
        newsList.add(n5);
        newsList.add(n6);

        ArrayList<Fruit> fruits = new ArrayList<>();
        Fruit apple = new Fruit("apple", "red", 90, 0.9);
        Fruit lychee = new Fruit("lychee", "red", 30, 0.75);
        Fruit peach = new Fruit("peach", "red", 130, 1.1);
        Fruit banana = new Fruit("banana", "yellow", 110, 0.45);
        Fruit orange = new Fruit("orange", "orange", 30, 1.24);
        Fruit mango = new Fruit("mango", "orange", 200, 2.23);
        Fruit grape = new Fruit("grape", "purple", 10, 0.27);
        fruits.add(apple);
        fruits.add(banana);
        fruits.add(orange);
        fruits.add(mango);
        fruits.add(grape);
        fruits.add(lychee);
        fruits.add(peach);

        /*--------------------------------------------------------------
         Q1
        --------------------------------------------------------------*/
        List<Fruit> lowCalFruits = fruits.stream().filter(fruit -> fruit.getCalories() < 100)
                .sorted((f1, f2) -> Integer.compare(f2.getCalories(), f1.getCalories())).collect(Collectors.toList());
        // System.out.println(lowCalFruits.toString());

        /*--------------------------------------------------------------
         Q2
        --------------------------------------------------------------*/
        // fruits.stream().forEach(fruit -> System.out.println(fruit.getColor()));

        /*--------------------------------------------------------------
        Q3
        --------------------------------------------------------------*/
        // fruits.stream().filter(fruit -> fruit.getColor().equals("red"))
        // .sorted((f1, f2) -> Double.compare(f1.getPrice(), f2.getPrice()))
        // .forEach(fruit -> System.out.println(fruit));

        /*--------------------------------------------------------------
        Q4
        --------------------------------------------------------------*/
        News maxComments = newsList.stream()
                .max((news1, news2) -> Integer.compare(news1.getComments(), news2.getComments()))
                .orElseThrow(NoSuchElementException::new);
        // System.out.println(maxComments);

        /*--------------------------------------------------------------
        Q5
        --------------------------------------------------------------*/
        int count=0;
        for (News news : newsList) {
            // split the string by spaces in a
            String a[] = news.getCommentByUser().split(" ");

            // search for pattern in a
            
            for (int i = 0; i < a.length; i++) {
                // if match found increase count
                if ("budget".equals(a[i]))
                    count++;
            }
        }
        // System.out.println("Total count is " + count);


        /*--------------------------------------------------------------
        Q6
        --------------------------------------------------------------*/
        News userWithMaxComments = newsList.stream()
                .max((news1, news2) -> Integer.compare(news1.getComments(), news2.getComments()))
                .orElseThrow(NoSuchElementException::new);
        // System.out.println(userWithMaxComments.getPostedByUser());

        /*--------------------------------------------------------------
        Q7
        --------------------------------------------------------------*/
        // newsList.stream().forEach(news-> System.out.println(news.getCommentByUser()));

        /*--------------------------------------------------------------
        Q8
        --------------------------------------------------------------*/
        // transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted((tr1,tr2)->Integer.compare(tr1.getValue(), tr2.getValue())).forEach(transaction -> System.out.println(transaction));
        
        /*--------------------------------------------------------------
        Q9
        --------------------------------------------------------------*/


        /*--------------------------------------------------------------
        Q10
        --------------------------------------------------------------*/
        // traders.stream().filter(trader-> trader.getCity().equals("Pune")).sorted((trader1,trader2)-> trader1.getName().compareTo(trader2.getName())).forEach(trader -> System.out.println(trader));
   
        /*--------------------------------------------------------------
        Q11
        --------------------------------------------------------------*/
        StringBuilder str = new StringBuilder();
        traders.stream().sorted((trader1,trader2)-> trader1.getName().compareTo(trader2.getName())).forEach(trader -> str.append(trader.getName() + " "));
        // System.out.println(str);

        
        /*--------------------------------------------------------------
        Q12
        --------------------------------------------------------------*/
        boolean tradersFromIndore = traders.stream().anyMatch(trader -> trader.getCity().equals("Indore"));
        // System.out.println(tradersFromIndore);

        /*--------------------------------------------------------------
        Q13
        --------------------------------------------------------------*/
        // transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Delhi")).forEach(trans -> System.out.println(trans.getValue()));;
    
        /*--------------------------------------------------------------
        Q14
        --------------------------------------------------------------*/
        Transaction maxTrans = transactions.stream().max((trans1,trans2) -> Integer.compare(trans1.getValue(),trans2.getValue())).orElseThrow(NoSuchElementException::new);
        // System.out.println(maxTrans.getValue());

        /*--------------------------------------------------------------
        Q14
        --------------------------------------------------------------*/
        Transaction minTrans = transactions.stream().min((tran1,tran2) -> Integer.compare(tran1.getValue(),tran2.getValue())).orElseThrow(NoSuchElementException::new);
        // System.out.println(minTrans.getValue());
    }
}
