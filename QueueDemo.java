import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo{
    public void run(Scanner sc) {
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
}