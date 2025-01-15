 import java.util.*;

public class linkeddList{

public static void main(String args[])
{
    LinkedList<Integer>a1=new LinkedList<>();
    LinkedList<Integer>a2=new LinkedList<>(List.of(12,23,45,65,21));

    a1.add(56);
    a1.add(12);
    a1.add(0, 59);
    a1.addAll(1,a2);
    a1.set(0, 69);
    a1.addFirst(32);
    a1.addLast(100);
    
    System.out.println("the first element is"+a1.peek() );
    a1.forEach(n->show(n));
    
}
static void show(int n)
    {
        //if(n>60)
        System.out.println(n);
    }
}
