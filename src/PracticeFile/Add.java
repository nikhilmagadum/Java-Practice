package PracticeFile;

import java.util.Scanner;

public class Add {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int num1 =  sc.nextInt();
        System.out.println("Enter the number 2 :");
        int num2 = sc.nextInt();
        System.out.println("The addition of two numbers are :");
        int sum = num1 + num2;

        System.out.println(sum);
    }
}
