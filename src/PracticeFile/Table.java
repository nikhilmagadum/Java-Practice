package PracticeFile;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Table {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Multiply : ");
        int n = sc.nextInt();

        for (int i = 1 ; i<= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i) );;
            }
        }
}

