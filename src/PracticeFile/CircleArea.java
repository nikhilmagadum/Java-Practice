package PracticeFile;

import java.util.Scanner;

public class CircleArea {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Program to find the area of a circle :");
        System.out.println();
        System.out.println("Enter the Radius of a circle : ");

        int r = sc.nextInt();
        float pi = 3.142f;
        float area = pi * r * r;
        System.out.println("The area of circle is : " + area);


    }
}
