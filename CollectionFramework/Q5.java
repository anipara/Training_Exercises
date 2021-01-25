package CollectionFramework;

import java.util.Hashtable;

public class Q5 {
    public static void main(String[] args) {
        Hashtable<Employee, Integer> employees = new Hashtable<>();
        employees.put(new Employee("Jack"), 1);
        employees.put(new Employee("Jill"), 2);
        employees.put(new Employee("Adem"), 3);
        employees.put(new Employee("Bill"), 4);
        // Prints out Jack, 4. QUESTION ON THIS
        System.out.println(employees);
        // Both print 4, since all employee objects produce same 
        // hashcode and 4 is the value stored for that key
        System.out.println(employees.get(new Employee("Adem")));
        System.out.println(employees.get(new Employee("Jill")));


    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 13;
    }    

    @Override 
    public String toString(){
        return this.name;
    }
}