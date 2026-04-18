package PracticeFile;

import java.util.Scanner;

public class Multiple5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Progra to check the multiple of a number : ");

        int N = sc.nextInt();

        if(N % 5 == 0) {
            System.out.println("it is Multiple of 5 " );
        }
        else {
            System.out.println("It is not multiple of 5 24 " );
        }
    }
}
