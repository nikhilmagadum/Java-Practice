package PracticeFile;

import java.util.Scanner;

public class PostiveOrNegative {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Program to chck the number  is positive or negative");
        int N = sc.nextInt();

        if (N == 0) {
            System.out.println("Zero");
        } else if (N < 0) {
            System.out.println("Negative");
        } else if (N > 0) {
            System.out.println("Positive");
        }
    }
}
