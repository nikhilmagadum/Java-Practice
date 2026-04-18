package PracticeFile;

import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Program to find whether the entered number is even or odd -");

        System.out.println("Enter the Number : ");
        int N =  sc.nextInt();

        if (N % 2 == 0) {
            System.out.println("The number is Even ");
        }
        else {
            System.out.println("The number is Odd ");
        }
    }
}
