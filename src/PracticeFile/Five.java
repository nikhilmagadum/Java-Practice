package PracticeFile;

import java.util.Scanner;

public class Five {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("The value till N is ");
//        for (int i = n; i >= 1; i-- ) {
//            System.out.println(i);
//        }
//        for (int i = n/2; i <= n; i= i+2 ) {
//            System.out.println(i);
//        }

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
