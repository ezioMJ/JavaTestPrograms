
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        System.out.println("AdvancedCalculator add called");
        return super.add(a, b);
    }
}

public class OverloadingOverriding {
    public static void main(String[] args) {
        Calculator calc = new AdvancedCalculator();
        System.out.println("Overloaded: " + calc.add(1, 2, 3));
        System.out.println("Overridden: " + calc.add(1, 2));
    }
}

