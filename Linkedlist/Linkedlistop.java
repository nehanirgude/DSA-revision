package Linkedlist;

public class Linkedlistop {

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

    // method to add node at first

    public void addFirst(int data) {

        // step1=create new node
        Node newNode = new Node(data);
        // if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2-newNode next=head
        newNode.next = head; // link

        // step3-head=newNode
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        // step1
        Node newNode = new Node(data);
        // special case
        if (head == null) {
            tail = head = newNode;
            return;
        }
        // step2
        tail.next = newNode;

        // case3
        tail = newNode;

    }

    public static void main(String args[]) {
        Linkedlistop ll = new Linkedlistop();
        // ll.head = new Node(1);

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
    }

}
