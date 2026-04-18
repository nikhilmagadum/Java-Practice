package PracticeFile;

import java.util.Scanner;
public class Execlude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 30;
        // write your code here
        System.out.print("Numbers: ");

        for(int i = 1;i <= N; i++) {
            if(i % 3 == 0 &&  i % 5 == 0) {
               // System.out.println();
                System.out.print(i + "  ");
                continue;
            } else {
                System.out.println();
              //  System.out.print(i + " ");
            }
        }
    }
}