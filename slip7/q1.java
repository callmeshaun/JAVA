package slip7;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        int []arr = new int[size];

        System.out.println("Enter ele");
        for(int i=0 ; i<size ; i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int x : arr)
        {
            sum=sum+x;
        }
        System.out.println("the sum is "+sum);
    }
}
