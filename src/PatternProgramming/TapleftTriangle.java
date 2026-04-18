package PatternProgramming;

public class TapleftTriangle {
    static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for(int j = 1; j <= i-j ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
