package PracticeFile;

import java.util.Scanner;

public class MultiplicationOR_Addition {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Program to find whether it is multiplication or addition ");
        System.out.println();
        System.out.println("IF both the numbers are even then do multiplication or else do additon");

        int N = sc.nextInt();
        int M = sc.nextInt();

        if(N % 2 == 0  && M % 2 == 0) {
            System.out.println(N * M );
        }
        else {
            System.out.println(N + M );
        }


    }
}
