package linked;

public class NthNodeFromEnd {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Add a node at the end
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    int findNthNodeFromEnd(int n) {
        Node first = head;
        Node second = head;

        // Move first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (first == null) {
                throw new IllegalArgumentException("Invalid n: larger than list size");
            }
            first = first.next;
        }

        // Move both until first reaches end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    public static void main(String[] args) {
        NthNodeFromEnd list = new NthNodeFromEnd();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("2nd node from end: " + list.findNthNodeFromEnd(2)); // should print 40
        System.out.println("5th node from end: " + list.findNthNodeFromEnd(5)); // should print 10
    }
}
