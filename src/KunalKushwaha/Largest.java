package KunalKushwaha;

import java.util.Scanner;

public class Largest {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 value of b :");
        int b = sc.nextInt();
        System.out.println("Enter the number 3 value of c :");
        int c = sc.nextInt();

        if (a > b) {
            System.out.println("a is the largest number : " );
        }else if (b > c){
            System.out.println("b is the largest number : " );
        } else {
            System.out.println("c is the largest number : " );
        }
    }
}
