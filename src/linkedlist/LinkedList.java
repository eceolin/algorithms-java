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

    public void deleteFirst(int element) {
        deleteFirst(element, head, null);
    }

    private void deleteFirst(int element, Node next, Node prev) {
        Node aux = next;

        if (aux.data == element) {
            if (prev == null) {
                head = aux.next;
                return;
            }
            prev.next = aux.next;
            return;
        } else if (aux.next == null && aux.data != element) {
            throw new RuntimeException("Data not found.");
        } else {
            deleteFirst(element, aux.next, aux);
        }

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