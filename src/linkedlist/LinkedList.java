package linkedlist;

public class LinkedList {

    Node head;
    Node tail;

    class Node {

        int data;
        Node next;

        Node(int data) { this.data = data; }
    }

    public void add(int element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void printAll() {
        if (head != null) {
            Node aux = head;
            System.out.println(aux.data);

            while (aux.next != null) {
                aux = aux.next;
                System.out.println(aux.data);
            }
        }
    }
}