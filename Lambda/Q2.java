package Lambda;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1000,"Completed"));
        orders.add(new Order(20000,"Completed"));
        orders.add(new Order(35000,"Accepted"));
        orders.add(new Order(17000,"Uncomplete"));
        orders.add(new Order(24000,"Completed"));
        orders.add(new Order(84000,"Uncomplete"));
        orders.add(new Order(57000,"Uncomplete"));
        orders.add(new Order(72000,"Uncomplete"));

        orders.forEach(order -> {
            if(order.getPrice() >= 10000 && (order.getStatus().equals("Accepted") || order.getStatus().equals("Completed"))){
                System.out.println(order);
            }
        });
    }
}


class Order {
    private int price;
    private String status;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(int price, String status) {
        this.price = price;
        this.status = status;
    }

    public String toString(){
        return this.price + " " + this.status;
    }
}