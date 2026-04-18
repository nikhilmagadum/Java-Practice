package PracticeFile;

import javax.script.ScriptContext;
import java.util.Scanner;

public class LargestOfTwoNumbers {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("program to find the largest of Two numbers: ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N > M ) {
            System.out.println("This is the Largest Number " + N  +" than " + M  );
        } else {
            System.out.println("This is the Largest Number " + M + " than " + N);
        }
    }
}
