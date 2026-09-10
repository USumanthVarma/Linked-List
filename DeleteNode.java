package linked;

public class DeleteNode {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Insert at end
    void insertAtEnd(int data) {

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

    // Delete node by value
    void delete(int value) {

        // If list is empty
        if (head == null) {
            return;
        }

        // If head node contains the value
        if (head.data == value) {
            head = head.next;
            return;
        }

        // Search for the node
        Node current = head;

        while (current.next != null &&
               current.next.data != value) {

            current = current.next;
        }

        // If value is found
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Display linked list
    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DeleteNode list = new DeleteNode();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Before deletion:");
        list.display();

        list.delete(30);

        System.out.println("After deletion:");
        list.display();
    }
}