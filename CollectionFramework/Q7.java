package CollectionFramework;

import java.util.HashMap;

public class Q7 {
    public static void main(String[] args) {
        ParkedCarOwner jim = new ParkedCarOwner("Jim", "Tesla", "12345678", "40838902", "Happy St.");
        ParkedCarOwner bill = new ParkedCarOwner("Bill", "Civic", "52343542", "0239840", "Sad St.");
        ParkedCarOwner dan = new ParkedCarOwner("Dan", "Lamb", "2347890", "234987", "Laugh St.");
        ParkedCarOwner eden = new ParkedCarOwner("Eden", "Corolla", "66293874", "1987231", "Jump St.");

        ParkedCarList garage = new ParkedCarList();
        garage.addCar(jim, "F1 S3");
        garage.addCar(bill, "F1 S2");
        garage.addCar(dan, "F3 S4");
        garage.addCar(eden, "F2 S3");
        garage.allCars();
        garage.removeCar(dan);
        System.out.println("----");
        garage.allCars();

    }
}

class ParkedCarOwner {
    private String ownerName, carModel, carNo, mobileNumber, address;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ParkedCarOwner(String ownerName, String carModel, String carNo, String mobileNumber, String address) {
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNumber = mobileNumber;
        this.address = address;

    }   
}

class ParkedCarList {
    private HashMap<ParkedCarOwner, String> garage;

    public ParkedCarList(){
        garage = new HashMap<>();

    }

    public void addCar(ParkedCarOwner car, String location){
        garage.put(car, location);
    }

    public void removeCar(ParkedCarOwner car){
        garage.remove(car);
    }

    public String getCarLocation(ParkedCarList token){
        if(garage.get(token) != null){
            return garage.get(token);
        }else {
            return "Car not in garage";
        }
    } 

    public void allCars(){
        this.garage.forEach((k,v)-> System.out.println(k.getCarModel() + " : " + v));
    }
}