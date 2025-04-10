package slip4;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        
        //rectangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int len= sc.nextInt();

        System.out.println("Enter the breadth");
        int bre=sc.nextInt();

        int area=len*bre;
        System.out.println(area);

        //triangle
        System.out.println("Enter the base");
        double base=sc.nextDouble();

        System.out.println("Enter the height");
        double height=sc.nextDouble();

        double areaa=0.5*base*height;
        System.out.println(areaa);
    }
    
}
