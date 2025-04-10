package slip2;

public class q2 {
    private String name;
    private double salary;

public q2(String name , double salary){

    this.name=name;
    this.salary=salary;
}

public String getName()
{
    return name;
}

public double getSalary()
{
    return salary;
}

public void display(){
    System.out.println(name+" "+salary);
}

public static void main(String[] args) {
    
    q2 []emp = new q2[5];

    emp[0]=new q2("shaunak", 500);
    emp[1]=new q2("shau", 700);
    emp[2]=new q2("sha", 800);
    emp[3]=new q2("sh", 800);
    emp[4]=new q2("sh", 800);

    for(q2 employee : emp)
    {
        employee.display();
    }
}

    
}

