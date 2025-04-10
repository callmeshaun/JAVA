package slip3;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = sc.nextInt();
        int []arr=new int [size];


        System.out.println("Enter elements");
        for(int i=0 ; i<size ; i++)
        {
            arr[i]=sc.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("the sum is "+sum);

        Arrays.sort(arr);
        System.out.println("Sorted order are");
        for(int x:arr)
        {
            System.out.println(+x);
        }
    }
    
}
