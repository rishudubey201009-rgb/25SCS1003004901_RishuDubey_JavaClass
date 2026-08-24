import java.util.Scanner;
public class program4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,i;
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        System.out.println("Reversed array:");
        for (i=0; i<=n/2; i++){
            a=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=a;
        for(i=0;i<n;i++)   
            System.out.print(arr[i] + " ");
    }sc.close();
        }}


