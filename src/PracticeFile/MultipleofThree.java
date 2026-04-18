package PracticeFile;

import java.util.Scanner;

public class MultipleofThree {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }

        }
    }
}
