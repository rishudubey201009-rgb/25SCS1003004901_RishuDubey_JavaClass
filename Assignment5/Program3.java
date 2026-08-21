import java.util.Scanner;

public class Program3 {
    public static void main(String[]args){       
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }

        System.out.println("Numbers divisible by 3 between 1 and " + n + " = " + count);
        sc.close();
    }

}


