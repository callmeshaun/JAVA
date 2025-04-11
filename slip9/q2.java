package slip9;

import java.util.Scanner;

interface operation{

    public static double pi=3.14;
    void area();
    void volume();
}

class cylinder implements operation{

    double radius , height;

    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter radius ");
        radius = sc.nextDouble();
        System.out.println("Enter height");
        height=sc.nextDouble();
    }

    public void area(){

        double a = (2*pi*height*radius)+(2*pi*radius*radius);
        System.out.println(a);
    }

    public void volume(){
        double b =(2*pi*height*radius);
        System.out.println(b);
    }

    public static void main(String[] args) {
        
        cylinder c1 = new cylinder();
        c1.accept();
        c1.area();
        c1.volume();
    }
}
