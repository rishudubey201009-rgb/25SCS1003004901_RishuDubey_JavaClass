class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class program1 {
     public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of two integers: " + c.add(1, 2));
        System.out.println("Sum of three integers: " + c.add(1, 2, 3));
        System.out.println("Sum of two decimal numbers: " + c.add(1.5, 2.5));
    }
}