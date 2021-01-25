package CollectionFramework;

import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        HashMap<Date,String> employees = new HashMap<>();
        employees.put(new Date(1,1,2000), "John");
        employees.put(new Date(2,12,1998), "adam");
        employees.put(new Date(3,24,1967), "bill");
        // Not sure what it means by get method should fail if two employees have similar info
    }

    public String getEmployee(Date d, HashMap<Date,String> employees){
        // employees.
        return null;
    }
}

class Date{
    int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }    

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
