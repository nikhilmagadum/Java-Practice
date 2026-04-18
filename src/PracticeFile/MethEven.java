package PracticeFile;

import java.util.Scanner;

public class MethEven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        EvenOdd(input);
    }

    static int  EvenOdd(int N) {
        if (N % 2 == 0) {
            System.out.println("The number is even ");
        } else {
            System.out.println("The number is odd ");
        }
        return N;
    }
}
