import java.util.Scanner;
public class ArrayDemo{
    public void run(Scanner sc){
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
}