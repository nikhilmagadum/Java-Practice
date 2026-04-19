package DSA.Arrays;
import java.util.Scanner;

public class D1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        // Basics of array how to declare,initialize and take user input using  for loop
        System.out.println("Enter the Array elements : ");
        for(int i = 0 ; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("The array elements are : ");
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}

// Basic array how to take  input and output