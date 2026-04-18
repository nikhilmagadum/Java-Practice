package PracticeFile;

import java.util.Scanner;

public class Circumference {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("program to find the circumferece of a circle : ");
        System.out.println();
        System.out.println("Enter the radius of a circle : ");

        int r = sc.nextInt();

        float pi = 3.142f;

        float circumference =  2 * pi * r;
        System.out.println("The circumference of a circle is : " + circumference);
    }
}
