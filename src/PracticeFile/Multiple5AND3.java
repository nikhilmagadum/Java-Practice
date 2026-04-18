package PracticeFile;

import java.util.Scanner;

public class Multiple5AND3 {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("program to check whether the number is multiple of 5 and 3  ");

        int N = sc.nextInt();

        if (N % 3 == 0 && N % 5 == 0) {
            System.out.println("Yes it is multiple of 3 and 5 ");
        } else {
            System.out.println("It is not multiple of 3 and 5 ");
        }
    }
}
