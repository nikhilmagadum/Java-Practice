package PracticeFile;

import java.util.Scanner;

public class Either257 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("program to print all the numbers which are multiples of 2,5,or 7 till N ");
        int N = sc.nextInt();
        System.out.println("check now");

        for(int i = 1; i<= N;i++){
            if(i % 2 == 0 || i % 5 == 0 || i % 7 ==0  ) {
                System.out.print(" " + i);
            }
        }
    }
}
