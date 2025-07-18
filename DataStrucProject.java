import java.util.Scanner;


public class DataStrucProject {

    public static void main(String[] args) {
        int choice;

        try (Scanner sc = new Scanner(System.in)) {
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
                    case 1 -> new ArrayDemo().run(sc);
                    case 2 -> new SLL().run(sc);
                    case 3 -> new StackDemo().run(sc);
                    case 4 -> new QueueDemo().run(sc);
                    case 5 -> new BinaryTree().run(sc);
                    case 0 -> System.out.println("Exiting program. Goodbye!");
                    default -> System.out.println("Invalid choice. Try again.");
                }

            } while (choice != 0);
        }
    }
}
