package slip9;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        boolean isPrime=true;

        if(number<=1)
            isPrime=false;
        
        else{

            for(int i=2 ; i<number ; i++)
            {
                if(number%i==0)
                {
                    isPrime=false;
                    break;
                }
             }
        }    
    

    if(isPrime)
    {
        System.out.println("The number is prime");
    }else{
        System.out.println("Not prime");    
    }
    
 }
}