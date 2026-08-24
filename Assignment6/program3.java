import java.util.Scanner;
public class program3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,a=0;
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int position = -1;
        for (i = 0; i < n; i++){
        if (arr[i] == key)
             System.out.print("Element found at");
            break;}
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                a=10;
             System.out.print(" position " +(i+1)+",");
            }}
        if (a==0)
            System.out.println("Element not found"+position+i);
    sc.close();
}
}
