package CollectionFramework;

import java.util.TreeSet;

public class Q1 {

	public static void main(String[] args) {
		Person jack = new Person("jack",5.5,100);
		Person bill = new Person("bill",5.2,100);
		Person adam = new Person("adam", 6.1,178);
		Person david = new Person("david",5.7,144);
		TreeSet<Person> people = new TreeSet<>();
		people.add(jack);
		people.add(bill);
		people.add(adam);
		people.add(david);
		System.out.println(people);  
	}

}


class Person implements Comparable<Person>{
	private String name;
	private double height,weight;
	
	public Person(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String toString() {
		return this.name + " " + this.height + " " + this.weight;
	}
	@Override
	public int compareTo(Person otherPerson) {
		if(Double.compare(this.getWeight(), otherPerson.getWeight()) == 0 ) {
			return Double.compare(this.getHeight(), otherPerson.getHeight());
		} else {
			return Double.compare(this.getWeight(), otherPerson.getWeight());
		}
    }
}