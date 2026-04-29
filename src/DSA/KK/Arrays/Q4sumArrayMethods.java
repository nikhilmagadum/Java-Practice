package DSA.KK.Arrays;

import java.util.*;

public class Q4sumArrayMethods {

    public static int findSum(int[] ar) {
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
        }
        return sum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int res = findSum(ar);
        System.out.println("The sum of Array elements are : " + res);
    }
}
