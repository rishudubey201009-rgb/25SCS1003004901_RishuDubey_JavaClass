import java.util.Scanner;
public class Program3 {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        int a=sc.nextInt();
        System.out.print("Enter Rate of Interest: ");
        int b =sc.nextInt();
        System.out.print("Enter Time (Years): ");
        int c =sc.nextInt();
        System.out.println("Simple Interest = " +(a*c*b/100));
    
    }
}
