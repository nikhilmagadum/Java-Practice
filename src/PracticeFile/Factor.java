package PracticeFile;

import java.util.Scanner;

public class Factor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = sc.nextInt();

        printFactors(n);
    }

    public static void printFactors(int number) {
            for(int i = 1; i <= number ;i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
    }
}

