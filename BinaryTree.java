import java.util.Scanner;
import java.util.TreeSet;

public class BinaryTree{
    public void run(Scanner sc) {
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