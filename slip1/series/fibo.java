package slip1.series;


public class fibo {

    public static void fibonacci(int n){
        int a=0 , b=1;
        
        for(int i =1 ; i<=n ;i++)
        {
            System.out.println(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}
