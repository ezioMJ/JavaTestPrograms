class Parent {
    String message = "Hello from Parent!";
}

class Child extends Parent {
    String message = "Hello from Child!";

    void printMessages() {
        System.out.println(this.message); 
        System.out.println(super.message); 
    }
}

public class ThisVsSuper {
    public static void main(String[] args) {
        Child child = new Child();
        child.printMessages();
    }
}

