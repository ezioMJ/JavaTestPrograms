class Car{
    String brand;
    int year;

    void display(){
        System.out.println("Brand : " + brand + " Year : " + year);
    }
}

public class ObjectClass{
    public static void main(String args[]){
        Car obj = new Car();
        obj.brand = "BMW";
        obj.year = 2025;
        obj.display();
    }
}