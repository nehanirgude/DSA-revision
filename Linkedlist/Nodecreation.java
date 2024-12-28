package Linkedlist;

public class Nodecreation {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        Nodecreation ll = new Nodecreation(); // obj of class nodecreation
        ll.head = new Node(1); // stored the data 1 in node
    }

}
