package PracticeFile;

import java.util.Scanner;

public class NaturalNumbers {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Program to print first N natural numbers ");

        int N = sc.nextInt();

        for(int i = 1; i <= N ; i++){
            System.out.println(i);
        }
    }
}
