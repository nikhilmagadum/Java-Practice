package DSA.KK.Arrays;
import java.util.Scanner;

public class Q2reverseArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int [] ar =  new int[n];

        System.out.println("Enter the array elements : ");

        for(int i = 0 ; i < ar.length;i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("The array elements after reversing are : ");

        for(int i = ar.length-1; i >= 0 ; i-- ) {
            System.out.println(ar[i]);
        }
    }
}
