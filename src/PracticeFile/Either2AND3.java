package PracticeFile;

import java.util.Scanner;

public class Either2AND3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 1;i <= N;i++){
            if(i % 2 == 0 || i % 3 ==0 ) {
                System.out.print(i + " ");
            }
        }
    }
}
