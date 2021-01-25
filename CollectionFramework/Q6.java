package CollectionFramework;

import java.util.Scanner;

public class Q6 {
    // Not sure how to approach this
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the chat room");
        System.out.println("Please choose an option: ");
        System.out.println("Create Chatroom");
        String response = scan.nextLine();
        while(!response.equals("quit")){
            System.out.println("Next option");
            response = scan.nextLine();
        }
    }
    
}

class User {
    private String name;
    private String pass;
    private Chatroom room;
}

class Chatroom{
    private String roomname;
    private User[] users;
}
