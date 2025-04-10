package slip8;


public class q2 {
    
    public static void main(String[] args) {
        
        if(args.length==0){
         System.out.println("enter some number");
         return;
        }
        try{
            int number = Integer.parseInt(args[0]);
            int rev=0;

            while(number!=0)
            {
                int digit=number%10;
                rev=rev*10+digit;
                number/=10;
            }
            System.out.println(rev);
        } catch(NumberFormatException e){
            System.out.println("error ");
        }
        
    }
}
