class Constants {
    static final double PI = 3.14159;
    static int count = 0;

    Constants() {
        count++;
    }

    static void displayCount() {
        System.out.println("Objects created: " + count);
    }
}

public class StaticAndFinal {
    public static void main(String[] args) {
        new Constants();
        new Constants();
        Constants.displayCount();
        System.out.println("Value of PI: " + Constants.PI);
    }
}
