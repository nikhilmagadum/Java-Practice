package DSA.KK.Arrays;
import java.util.Scanner;
public class Q3SumArray {
    static void main(String[] args) {
        System.out.println("Enter the array size: ");
         Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter the array elements : ");

        int sum = 0;
        for(int i = 0; i <ar.length;i++) {
            ar[i] = sc.nextInt();

            sum = sum + ar[i];  // Logic for Sum of array elements
        }
        System.out.println("The sum of Array are: " + sum);
    }
}
