package DSA.Arrays;
import java.util.Scanner;

public class Day1 {

    static void main() {

        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the array size : ");
//        int n =  sc.nextInt();

        System.out.println("Enter The array elements : ");
        int marks[] = new int[5];
        int sum =  0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            sum =  sum + marks[i];

        }

        System.out.println("The sum of the array elements are : " + sum );

//
//        System.out.println("The array elements after reversing the array are : ");
//        for (int i = marks.length - 1; i >= 0; i--) {
//            System.out.println(marks[i]);
//        }

    }
}
