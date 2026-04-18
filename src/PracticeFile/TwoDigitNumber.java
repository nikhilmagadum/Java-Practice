package PracticeFile;

import java.util.Scanner;

public class TwoDigitNumber {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Program to check whether the entered number is Two digit number or not ");
        System.out.println();
        int N = sc.nextInt();

        if (N >= 10 && N <= 99 ) {
            System.out.println("The Number is a two digit Number ");
        } else {
            System.out.println("The number is Not a Two digit number ");
        }
    }
}
