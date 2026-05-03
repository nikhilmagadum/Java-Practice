package DSA.KK.Arrays;
import java.util.Scanner;
//WAP to  find the number of K value occurances in an array
public class Q9NumberofKoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        int [] ar = new int[n];

        System.out.println("Enter the array elements : ");
        for(int i = 0; i< ar.length;i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("Enter the K value to find How many times it has occured : ");
        int k = sc.nextInt();
        int count = 0;


        for (int i = 0; i < ar.length;i++) {
            if(ar[i] == k) {  // this will check wether the array values are equal to the given K value
                count += 1;  // here if it is true then it will count the value and store it
            }
        }
        System.out.println("Number of occurance of K value: " + count); // here i am printing the  number of occarance of K value
    }
}
