package PracticeFile;

import java.util.Scanner;

public class SumCombination {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int firstCombination = a + b;
        System.out.println(firstCombination);

        int secondCombination =  b + c ;
        System.out.println(secondCombination);

        int thirdCombination =  a + c ;
        System.out.println(thirdCombination);
    }
}
