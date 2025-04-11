package slip10;

public class q1 {

    public static void main(String[] args) {
        
        if(args.length==0){
            System.out.println("error");
            return;
        }

       try{

        int number = Integer.parseInt(args[0]);

        for(int i=1 ; i<number; i++)
        {
            if(number%i==0)
                System.out.println(i);
        }
       }catch(NumberFormatException e)
       {
        System.out.println("error");
       }
    }
    
}
