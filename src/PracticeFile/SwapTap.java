package PracticeFile;

import java.util.Scanner;

public class SwapTap {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
      //  System.out.println(a);
        int b = sc.nextInt();
     //  System.out.println(b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
