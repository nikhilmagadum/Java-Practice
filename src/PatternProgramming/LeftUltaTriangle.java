package PatternProgramming;

public class LeftUltaTriangle {

    public static void main(String[] args) {
        // Use nested for loops to print the given pattern
        for (int i = 0 ; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
