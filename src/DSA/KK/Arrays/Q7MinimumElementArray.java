package DSA.KK.Arrays;

import java.util.Scanner;

public class Q7MinimumElementArray {

    public static int minimum(int[] ar) {
//       int max = 0;
        int min = ar[0];
        for(int i = 0; i < ar.length;i++) {
            if(ar[i] > min) {
                min = ar[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arry size: ");
        int n = sc.nextInt();


        int[]  ar = new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i = 0;i<ar.length;i++) {
            ar[i] =  sc.nextInt();
        }

        int Minimum_value = minimum(ar);
        System.out.println(Minimum_value);

    }
}

