import java.util.Scanner;
public class program5 {
    public static void main (String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your passward for varification");
        String a=sc.nextLine();
        if (a.length() < 8)
            System.out.println("Password is less than 8 characters");
         else if (a.length() < 12) 
            System.out.println("Password is acceptable");
         else 
            System.out.println("Password is strong");
         sc.close();
        }
    
}
