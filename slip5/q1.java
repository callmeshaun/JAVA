package slip5;

import java.util.Scanner;

public class q1 {
   
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();

        double area = 3.142*radius*radius;
        System.out.println(area);
        double peri = 2*3.142 * radius;
        System.out.println(peri);

    }
}
