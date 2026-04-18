package PracticeFile;

import  java.util.Scanner;

public class MethodwithReturn {
    Scanner sc = new Scanner(System.in);

    static int add() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number 1 : ");
        int a  = sc.nextInt();

        System.out.println("Enter the number 2 : ");
        int b =  sc.nextInt();
        int sum =  a + b;
        return  sum;
    }
    static void main(String[] args) {


       int add = add();
        System.out.println("The addition of two numbers are :");
        System.out.println(add);

    }
}
