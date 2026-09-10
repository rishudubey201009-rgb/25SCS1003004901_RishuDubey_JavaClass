class Maximum {
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
    int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    double max(double a, double b) {
        return (a > b) ? a : b;
    }
}
public class program3 {
    public static void main(String[] args) {
        Maximum m = new Maximum();
        System.out.println("Maximum of two integers: " + m.max(10, 20));
        System.out.println("Maximum of three integers: " + m.max(10, 25, 15));
        System.out.println("Maximum of two decimal numbers: " + m.max(15.5, 12.8));
    }
}