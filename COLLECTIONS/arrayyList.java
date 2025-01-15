import java.util.*;

public class arrayyList{

public static void main(String args[])
{
    ArrayList<Integer>a1=new ArrayList<>(20);
    ArrayList<Integer>a2=new ArrayList<>(List.of(12,23,45,65,21));

    a1.add(56);
    a1.add(12);
    a1.add(0, 59);
    a1.addAll(1,a2);
    a1.set(0, 69);

    // System.out.println(a1);
    // System.out.println(a1.contains(99));
    // System.out.println(a1.get(5));
    // System.out.println(a1.indexOf(21));

    //ITEARTION IN ARRAY LIST

    // for(int i=0;i<a1.size();i++)
    //  System.out.println(a1.get(i));

    // for (Integer x : a1) {
    //     System.out.println(x);
    //}

    // Iterator<Integer>al1=a1.iterator();
    // while (al1.hasNext()) {
    //     System.out.println(al1.next());;
    // }

    // ListIterator<Integer>al1=a1.listIterator();
    // while(al1.hasPrevious())
    // {
    //     System.out.println(al1.previous());
    // }

    // a1.forEach(n->System.out.println(n));
    // a1.forEach(System.out::println);
    a1.forEach(n->show(n));
}
   static void show(int n)
    {
        if(n>60)
        System.out.println(n);
    }



}
