package slip8;

import java.util.Scanner;

class InvalidNameException extends Exception{
    public InvalidNameException(String message){
        super(message);
    }
}

public class q1{

    public static void validate(String name)throws InvalidNameException{
        if(!name.matches("^[a-zA-Z\\s]+$")){
            throw new InvalidNameException("error");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        try{

            validate(name);
            System.out.println("valid name");

        }
        catch(InvalidNameException e)
        {
            System.out.println("error"+e.getMessage());
        }
        finally{
            sc.close();
        }
    }

}