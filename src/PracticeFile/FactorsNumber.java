package PracticeFile;

import java.util.Scanner;

public class FactorsNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number : ");
        int n = sc.nextInt();

       int  res =  countFactors(n);
        System.out.println(res);
    }

    static int  countFactors(int number){
         int count = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                count++;
            }
        }
        return count;

    }
}
