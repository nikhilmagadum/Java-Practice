package NikhithaMam.Fundamentals;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt(); // 3
        int M = sc.nextInt(); // 5

        factorial(N);
        factorial(M);

    }
    static  void factorial(int num) {
        if (num == 0) {
            System.out.println("fact of 0 = 1");
        } else {
            int fact = 1;
            for (int i=1;i<=num;i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}
