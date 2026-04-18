package PracticeFile;

import java.util.Scanner;

public class NaturalEven {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("program to print first N natural even numbers ");

        int N = sc.nextInt();

        for (int i = 1; i<= N; i++){
           if(i % 2 == 0) {
           System.out.println(i);
         }
        }
    }
}
