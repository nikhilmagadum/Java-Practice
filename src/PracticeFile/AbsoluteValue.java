package PracticeFile;

import java.util.Scanner;

public class AbsoluteValue {
    static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Program to print the absolute value of an intger ");
        int N = sc.nextInt();

        if (N < 0) {
            N = -(N);
            System.out.println(N);
        } else {
            System.out.println(N);
        }
    }
}
