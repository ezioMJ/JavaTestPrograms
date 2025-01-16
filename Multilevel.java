class Vehicle{
    String make;
    String model;
    int year;
    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayInfo(){
        System.out.println("Make : " + make + " Model : " + model + " Year : " + year);
    }
    void start(){
        System.out.println("Vehicle is Started");
    }
}

class Car extends Vehicle{
    String engineType;
    int numDoors;

    Car(String make, String model, int year, String engineType, int numDoors){
        super(make,model,year);
        this.engineType = engineType;
        this.numDoors = numDoors;
    }

    @Override
    void start(){
        System.out.println("Car Started");
    }

    void displayCarDetails(){
        System.out.println("Engine Type : " + engineType + " Num of Doors : " + numDoors);
    }

}

class ElectricCar extends Car{
    String batteryCapacity;
    int chargingTime;

    ElectricCar(String make, String model, int year, String engineType, int numDoors, String batteryCapacity, int chargingTime){
        super(make,model,year,engineType,numDoors);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void start(){
        System.out.println("Electric Car Started");
    }

    void displayElectricCarDetails(){
        System.out.println("Battery Capacity : " + batteryCapacity + " Charging Time : " + chargingTime);
    }
}

public class Multilevel{
    public static void main(String[] args){
        ElectricCar obj = new ElectricCar("Tesla", "X", 2025, "Electric", 4, "500wh", 5);
        obj.displayInfo();
        obj.displayCarDetails();
        obj.displayElectricCarDetails();
        obj.start();
    }
}