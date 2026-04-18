package PracticeFile;

import java.util.Scanner;

public class EndswithZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to check whether the number entered will end with zero or not ");
        System.out.println();

        int N =  sc.nextInt();
        if (N%10 == 0) {
            System.out.println("Yes ends with zero ");
        } else {
            System.out.println("Not end with zero ");
        }
    }
}
