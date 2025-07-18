import java.util.Scanner;

public class SLL {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head = null;

    // Run method to show menu and perform operations
    public void run(Scanner sc) {
        // Linked List explanation
        System.out.println("A singly linked list is a linear data structure where each element (called a node) contains a value and a reference to the next node in the sequence.");
        System.out.println("Unlike arrays, linked lists do not have a fixed size and can grow or shrink dynamically.");
        System.out.println("They are useful for efficient insertions and deletions, especially when the size of the data set changes frequently.");
        System.out.println("However, accessing elements by index is slower compared to arrays, since you must traverse the list from the beginning.\n");

        while (true) {
            System.out.println("\nLinked List Menu:");
            System.out.println("1. Insert at end");
            System.out.println("2. Display list");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an option: ");

            int option = sc.nextInt();

            if (option == 0) {
                break;
            }

            switch (option) {
                case 1 -> insertAtEnd(sc);
                case 2 -> displayList();
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    // Insert method
    private void insertAtEnd(Scanner sc) {
        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Inserted " + value + " at the end of the list.");
    }

    // Display method
    private void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node current = head;
            System.out.print("Linked List: ");
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}
