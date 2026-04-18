package NikhithaMam.Fundamentals;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        System.out.println("Program to print 1 to 10");
        Scanner sc =  new Scanner(System.in);
        int num =sc.nextInt();
        for(int i = 1;i <= num;i++){
            System.out.println(i);
        }
    }
}
