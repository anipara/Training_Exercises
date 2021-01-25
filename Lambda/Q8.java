package Lambda;

import java.util.ArrayList;

public class Q8 {
    public static void main(String[] args) {
        myThread T1 = new myThread( "Thread-1");
        T1.start();
    }
}

class myThread extends Thread {
    private Thread t;
    private String threadName;

    myThread(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.forEach(num -> System.out.println(num));
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
