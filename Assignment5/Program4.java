import java.util.Scanner;
public class Program4 {
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt(),i,a=1;
        if (n==1||n==0){
          System.out.println("not prime");
        }
        else
          {for(i=2;i<=n/2;i++){
             if (n%i==0){
                System.out.println("not prime");
                 a=0;
                break;
                }
            }
            if(a!=0)
                System.out.println("prime "); 
          } 
        sc.close();
          }
     }


