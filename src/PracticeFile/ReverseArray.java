package PracticeFile;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Ask user for array size and create the array
        int n = scanner.nextInt();
        int[] arr = new int[n];
        // TODO: Populate the array with user input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        // TODO: Print the original array
        System.out.print("Original array: [");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        // TODO: Reverse the array
        System.out.print("\nReversed array: [");
        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        scanner.close();
    }
}
