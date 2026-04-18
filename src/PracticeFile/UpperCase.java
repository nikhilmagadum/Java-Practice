package PracticeFile;

import java.util.Scanner;

public class UpperCase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to check whether the integer is uppercase value or lowercase value");
        System.out.println();

        int N = sc.nextInt();
        if(N>= 65 && N <= 90) {
            System.out.println("Uppercase");
        } else if (N >=97 && N <= 122) {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Not a alphabet character ");
        }
    }
}
