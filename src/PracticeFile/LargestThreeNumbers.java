package PracticeFile;

import java.util.Scanner;

public class LargestThreeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print the Largest of Three numbers");
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Z = sc.nextInt();
        
        if (N > M ) {
            System.out.println(N);
        } else if (M > Z) {
            System.out.println(M);
        } else {
            System.out.println(Z);
        }
    }
}
