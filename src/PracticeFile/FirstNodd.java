package PracticeFile;

import java.util.Scanner;

public class FirstNodd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number ");

        int N  = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
