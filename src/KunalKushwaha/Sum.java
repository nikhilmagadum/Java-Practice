package KunalKushwaha;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1: ");
        float num1 = sc.nextFloat();
        System.out.println("enter number 2: ");
        float num2 = sc.nextFloat();

        float sum =  num1 + num2;

        System.out.println("Sum = " + sum );
    }
}
