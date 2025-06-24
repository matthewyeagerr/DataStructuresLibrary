import java.util.*;


public class DataStrucProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Data Structure Project ===");
            System.out.println("1. Array");
            System.out.println("2. Single Linked List");
            System.out.println("3. Stack");
            System.out.println("4. Queue");
            System.out.println("5. Binary Tree");
            System.out.println("0. Exit");
            System.out.print("Choose a data structure to explore: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Array selected.");
                    ArrayDemo(sc);
                }
                case 2 -> {
                    System.out.println("Single Linked List selected.");
                    SingleLinkedListDemo(sc);

                }
                case 3 -> {
                    System.out.println("Stack selected.");
                    StackDemo(sc);
                }
                case 4 -> {
                    System.out.println("Queue selected.");
                    runQueueDemo(sc);
                }
                case 5 -> {
                    System.out.println("Binary Tree selected.");
                    runBinaryTreeDemo(sc);
                }
                case 0 -> System.out.println("Exiting program. Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    private static void ArrayDemo(Scanner sc){
        System.out.println("Arrays are a fundamental data structure in Java.");
        System.out.println("They store a fixed-size sequence of elements of the same type.");
        System.out.println("Each element can be accessed by its index, starting from 0.");
        System.out.println("Arrays are useful for storing and accessing data efficiently when the size is known in advance.\n");

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Array of size " + size + " created.");
        System.out.println("You can now add elements to the array.");
        for(int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void SingleLinkedListDemo(Scanner sc) {
        // Linked List explanation
        System.out.println("A singly linked list is a linear data structure where each element (called a node) contains a value and a reference to the next node in the sequence.");
        System.out.println("Unlike arrays, linked lists do not have a fixed size and can grow or shrink dynamically.");
        System.out.println("They are useful for efficient insertions and deletions, especially when the size of the data set changes frequently.");
        System.out.println("However, accessing elements by index is slower compared to arrays, since you must traverse the list from the beginning.\n");

        class Node{
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node head = null;
        while (true) { 
            System.out.println("\nLinked List Menu:");
            System.out.println("1. Insert at end");
            System.out.println("2. Display list");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an option: ");

            int option = sc.nextInt();

            if (option == 0) {
                break; // Exit the loop to return to the main menu
            }
            switch (option) {
                case 1 -> {
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    Node newNode = new Node(value);
                    if (head == null) {
                        head = newNode; // If list is empty, set head to new node
                    } else {
                        Node current = head;
                        while (current.next != null) {
                            current = current.next; // Traverse to the end of the list
                        }
                        current.next = newNode; // Link the new node at the end
                    }
                    System.out.println("Inserted " + value + " at the end of the list.");
                }
                case 2 -> {
                    if (head == null) {
                        System.out.println("List is empty.");
                    } else {
                        Node current = head;
                        System.out.print("Linked List: ");
                        while (current != null) {
                            System.out.print(current.data + " -> ");
                            current = current.next; // Move to the next node
                        }
                        System.out.println("null");
                    }
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }


    } // <-- This closes SingleLinkedListDemo

    private static void StackDemo(Scanner sc) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("LIFO (Last In, First Out) structure selected.");

        int choice;
        do { 
            System.out.println("\nStack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display stack");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            if (choice == 0) {
                break; // Exit the loop to return to the main menu
            }
            switch (choice) {
                case 1 -> {
                    // Push functionality
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    System.out.println("Pushed " + value + " onto the stack.");
                }
                case 2 -> {
                    // Pop functionality
                    // Add pop logic here
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot pop.");
                    } else {
                        int poppedValue = stack.pop();
                        System.out.println("Popped value: " + poppedValue);
                    }
                    
                }
                case 3 -> {
                    // Display stack functionality
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Current stack contents: " + stack);
                    }
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (choice != 0);
    } // <-- This closes StackDemo
    private static void runQueueDemo(Scanner sc) {
    System.out.println("\n--- Queue Explanation ---");
    System.out.println("A queue is a First-In-First-Out (FIFO) data structure.");
    System.out.println("Java provides Queue interface implemented by LinkedList and ArrayDeque.\n");

    Queue<Integer> queue = new LinkedList<>();

    int choice;
    do {
        System.out.println("\nQueue Menu:");
        System.out.println("1. Enqueue (add element)");
        System.out.println("2. Dequeue (remove element)");
        System.out.println("3. Display queue");
        System.out.println("0. Back to main menu");
        System.out.print("Choose an option: ");

        choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter integer to enqueue: ");
                int val = sc.nextInt();
                queue.offer(val); // adds element
                System.out.println(val + " added to the queue.");
            }
            case 2 -> {
                Integer removed = queue.poll(); // removes head or returns null if empty
                if (removed == null) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println(removed + " removed from the queue.");
                }
            }
            case 3 -> {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println("Queue contents: " + queue);
                }
            }
            case 0 -> System.out.println("Returning to main menu...");
            default -> System.out.println("Invalid choice. Try again.");
        }
    } while (choice != 0);
}
    private static void runBinaryTreeDemo(Scanner sc) {
        System.out.println("\n--- Binary Tree Explanation ---");
        System.out.println("A binary tree is a tree data structure where each node has at most two children.");
        System.out.println("Java provides TreeSet and TreeMap for tree-based structures.\n");

        TreeSet<Integer> tree = new TreeSet<>();
        int choice;
        do { 
            System.out.println("\nBinary Tree Menu:");
            System.out.println("1. Insert element");
            System.out.println("2. Display tree (in-order traversal)");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter integer to insert: ");
                    int val = sc.nextInt();
                    tree.add(val); // adds element
                    System.out.println(val + " added to the binary tree.");
                }
                case 2 -> {
                    if (tree.isEmpty()) {
                        System.out.println("Binary tree is empty.");
                    } else {
                        System.out.println("In-order traversal of the binary tree: " + tree);
                    }
                }
                case 0 -> System.out.println("Returning to main menu...");
                default -> System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);
    }
}
