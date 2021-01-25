package Streams;

public class Fruit {
    private String name,color;
    private int calories;
    private double price;

    public Fruit(String name, String color, int calories, double price) {
        this.name = name;
        this.color = color;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return this.name + " " + this.calories + " " + this.color + " " + this.price;
    }
}
