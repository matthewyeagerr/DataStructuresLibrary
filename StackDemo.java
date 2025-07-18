import java.util.Scanner;
import java.util.Stack;
public class StackDemo{
    public void run(Scanner sc) {
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
                break; 
            }
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    System.out.println("Pushed " + value + " onto the stack.");
                }
                case 2 -> {
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot pop.");
                    } else {
                        int poppedValue = stack.pop();
                        System.out.println("Popped value: " + poppedValue);
                    }
                    
                }
                case 3 -> {
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Current stack contents: " + stack);
                    }
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (choice != 0);
    } 
}