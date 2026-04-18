package PracticeFile;

import java.util.Scanner;

public class Multipleof5 {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i<= N;i++) {
            if(i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
