import java.util.Scanner;
public class program4 {
      public static void main (String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number between 1 to 7"); 
        int a=sc.nextInt();
        if(a>0&&a<5)
            System.out.println("Working Day"); 
      else if(a>5&&a<8)
        System.out.println("Weekend"); 
      else 
        System.out.println("invalide number"); 
      }
    
}
