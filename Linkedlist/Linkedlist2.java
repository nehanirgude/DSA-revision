package Linkedlist;

import java.util.LinkedList;

//how to use linkedlist using java collection framework
public class Linkedlist2 {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        // create a linked list
        // here Integer is a class we cannot use direct data type int , float , char
        // instead we have to use Integer , Character,Float etc

        // add opt

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);
        ll.addFirst(5);

        // 5->3->1->2
        System.out.println(ll);

        // remove opt

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }

}
