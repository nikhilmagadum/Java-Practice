package PracticeFile;

import java.util.Scanner;

public class NtoOneNatural {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Program to print first N natural numbers ");

        int N = sc.nextInt();

        for(int i = N; i >= 1 ; i--){
            System.out.println(i);
        }
    }
}
