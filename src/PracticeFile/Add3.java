package PracticeFile;

import java.util.Scanner;

public class Add3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("program to add three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum =  a + b + c ;
        System.out.println(sum);
    }
}
