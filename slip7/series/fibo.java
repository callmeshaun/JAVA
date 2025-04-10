package slip7.series;

public class fibo {

    public static void fibonnaci(int n)
    {
        int a=0 , b=1;
        for(int i=1 ; i<=n ; i++)
        {
            System.out.println(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
    
}
