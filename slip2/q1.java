package slip2;
import java.io.*;
import java.util.*;

public class q1 {

    public static void main(String[] args) {
        int rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        while(num!=0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;


        }
        System.out.println(rev);

    }
    
}
