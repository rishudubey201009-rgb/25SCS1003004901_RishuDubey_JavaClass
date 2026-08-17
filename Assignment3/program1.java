import java.util.Scanner;
public class program1 {
    public static void main(String[]ard){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:- ");
        int a=sc.nextInt();
        if (a>0){
           System.out.println("given number "+a+" is positive and ");
            if (a%2==0)
            System.out.println(  "even number");
           else
            System.out.println( "odd number");
        }else if(a<0)
             System.out.println("given number "+a+" is negative number ");
        else
            System.out.println("given number "+a+" is zero ");
        sc.close();
    }
    
}
