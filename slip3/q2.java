package slip3;

public class q2 {
    private int x;

    public q2(){
        int x=0;
    }

    public q2(int x)
    {
        this.x=x;
    }

    public boolean isNegative(){
        if(x<0)
        return true;
        else
        return false;    
    }

    public boolean isPositive(){
        if(x>0)
        return true;
        else
        return false;
    }

    public boolean isZero(){
        if(x==0)
        return true;
        else
        return false;
    }

    public boolean isOdd()
    {
        if(x%2!=0)
        return true;
        else
        return false;
    }

    public boolean isEven()
    {
        if(x%2==0)
        return true;
        else
        return false;
    }

    public static void main(String[] args)throws ArrayIndexOutOfBoundsException
    {
        
        int x = Integer.parseInt(args[0]);
        q2 m = new q2(x);

        if(m.isPositive())
            System.out.println("Is positive");
        if(m.isNegative())
            System.out.println("Is negative");
        if(m.isZero())
            System.out.println("Is zero");
        if(m.isOdd())
            System.out.println("Is odd");
        if(m.isEven())
            System.out.println("Is even");                
    }
    
}
