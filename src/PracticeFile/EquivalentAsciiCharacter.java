package PracticeFile;

import java.util.Scanner;

public class EquivalentAsciiCharacter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to find the equivalent Ascii character of a number : ");
        int N = sc.nextInt();
        System.out.println();
        char eqvi = (char)N;
        System.out.println(eqvi);
    }
}
