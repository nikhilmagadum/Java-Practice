package DSA.KK.Arrays;

import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ar = new int[n];

        for(int i = 0;i<ar.length;i++) {
            ar[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = ar[x] * ar[y];

        System.out.println(result);
    }
}