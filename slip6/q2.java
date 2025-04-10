package slip6;
import java.util.Scanner;

class emp{
  private int id;
  private String name;
  private String dept;
  private double salary;

  public emp()
  {
    id=0;
    name=null;
    dept=null;
    salary=0.0;
  }

  public emp(int eid , String ename , String edept , double esalary)
  {
    id=eid;
    ename=name;
    edept=dept;
    esalary=salary;
  }

  public void acceptE()
  {
    Scanner sc = new Scanner(System.in);
     System.out.println("Id");
     id=sc.nextInt();
     System.out.println("Name");
     name=sc.next();
     System.out.println("Dept");
     dept=sc.next();
     System.out.println("Salary");
     salary=sc.nextDouble();
  }

  public void displayE()
  {
    System.out.println(" "+id);
    System.out.println(" "+name);
    System.out.println(" "+dept);
    System.out.println(" "+salary);
  }

  public double salary()
  {
    return salary;
  }

  class Manager extends emp{

    public double bonus;

    public void acceptM()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the bonus ");
      bonus=sc.nextDouble();
    }

    public void displayM()
    {
      System.out.println(bonus+" ");
    }

    public static int max( Manager m[], int n)
    {
      double max=0;
      int t=0;
      for(int i=0 ; i<=n ; i++)
      {
      if(max<(m[i].salary()+ m[i].bonus))
      {
        max=m[i].salary()+m[i].bonus;
        t=i;
      }
    }
    System.out.println("The max is "+max);
    return t;
    }
  }

 class q2 {
   public static void main(String[] args) {
    int n,i,ans;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many records");
    n=sc.nextInt();
    Manager m[]=new Manager[n];
    for(i=0 ; i<n ;i++)
    {
      m[i].new Manager();
      m[i].acceptE();
      m[i].displayE();
      m[i].acceptM();
      m[i].displayM();

    }

    ans = Manager.max(m,n);
    m[ans].displayE();
    m[ans].displayM();

  }
}

}