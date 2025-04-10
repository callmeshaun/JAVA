package slip1;

import java.io.*;


public class q1 {

    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number\n");
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <=10; i++){

            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
