//add and delete like queue
//insted of stack use dequeue
//it is faster time is constant

import java.util.ArrayDeque;

public class arrayydeque {

    public static void main(String[] args) {
        
        ArrayDeque<Integer> a1 =new ArrayDeque<>();

        a1.offerLast(10);
        a1.offerLast(20);
        a1.offerLast(30);

        //lambda

        // a1.forEach((x)->System.out.println(x));

        //stack
        a1.pollLast();

        //queue
        a1.pollFirst();

        // a1.offerFirst(1);
        // a1.offerFirst(2);
        // a1.offerFirst(3);

        a1.forEach((x)->System.out.println(x));


    }
}