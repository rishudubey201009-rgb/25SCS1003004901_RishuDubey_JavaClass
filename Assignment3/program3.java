import java.util.Scanner;
public class program3 {
    public static void main(String[]arg){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number: "); 
     int a=sc.nextInt();
     if(a%5==0){
         System.out.println("given number is divisible by 5 "); 
        if(a%10==0)
          System.out.println("and also by 10 "); 
        else
             System.out.println("but not by 10"); 
     }else 
        System.out.println("given number is not divisible by 5 "); 
      sc.close();
      }
}
