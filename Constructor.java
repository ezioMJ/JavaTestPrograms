class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee emp = new Employee("Vishvanth", 1);
        emp.displayInfo();
    }
}

