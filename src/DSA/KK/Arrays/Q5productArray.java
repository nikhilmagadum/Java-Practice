package DSA.KK.Arrays;

import java.util.*;

public class Q5productArray {

    public static long findSum(long[] ar) {
        long prod = 1;

        for (int i = 0; i < ar.length; i++) {
            prod = prod * ar[i];
        }
        return prod;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        long[] ar = new long[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        long res = findSum(ar);
        System.out.println("The product of Array elements are : " + res);
    }
}