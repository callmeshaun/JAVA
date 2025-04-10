package slip4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class customer {
    int c_id;
    String c_name;
    String address;
    String mobile_no;

public customer(int c_id , String c_name , String address , String mobile_no){
    this.c_id=c_id;
    this.c_name=c_name;
    this.address=address;
    this.mobile_no=mobile_no;
}    
}
public class q2{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String filename="customer.dat";

        

        try{
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));

            System.out.println("Enter no of customer");
            int n = sc.nextInt();
            sc.nextLine();

            for(int i =0 ; i<n ; i++)
            {
                System.out.println(i+1);
                System.out.println("Enter the customer id");
                int c_id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter name");
                String c_name=sc.nextLine();
                System.out.println("Enter address");
                String address=sc.nextLine();
                System.out.println("enter mobile");
                String mobile=sc.nextLine();

                dos.writeInt(c_id);
                dos.writeUTF(c_name);
                dos.writeUTF(address);
                dos.writeUTF(mobile);

               
            }
            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream(filename));

            for(int i=0 ; i<n ; i++)
            {
                int id = dis.readInt();
                String name=dis.readUTF();
                String add =dis.readUTF();
                String mob=dis.readUTF();

                
                System.out.println(id);
                System.out.println(name);
                System.out.println(add);
                System.out.println(mob);
            }
            dis.close();
        }catch(IOException e)
        {
          e.printStackTrace();  
     }
     sc.close();
    }

}

