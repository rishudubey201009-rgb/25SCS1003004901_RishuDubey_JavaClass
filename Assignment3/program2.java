import java.util.Scanner;
public class program2{
    public static void main(String[]arg){
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter 3 numbers: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b&&a>c)
        System.out.println("largest number is: "+a);
    else if(b>c)
       System.out.println("largest number is: "+b); 
    else
     System.out.println("largest number is: "+c);
     sc.close();
    }
}