// Program 1: Find the sum of numbers from 1 to N
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
        sc.close();
    }
}

