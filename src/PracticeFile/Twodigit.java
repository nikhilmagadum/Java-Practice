package PracticeFile;

import java.util.Scanner;

public class Twodigit {
    static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1 ; i <=n ; i++) {
            if (i > 9 && i < 100){
                System.out.println(i);
            }
        }
    }}
