package slip5;

public class q2 {

    private int dd;
    private int mm;
    private int yy;


public q2(){
    this. dd=1;
    this. mm=1;
    this.yy=200;
}

public q2(int dd , int mm , int yy)
{
    this.dd=dd;
    this.mm=mm;
    this.yy=yy;
}

public void display(){
    System.out.printf("%02d-%02d-%04d\n",this.dd,this.mm,this.yy);
}

public static void main(String[] args) {
    
    q2 date1 = new q2();
    date1.display();

    q2 date2 = new q2(05,06,2003);
    date2.display();
}
    
}
