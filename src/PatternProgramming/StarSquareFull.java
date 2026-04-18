package PatternProgramming;

public class StarSquareFull {

        public static void main(String[] args) {
            // Use nested for loops to print the given pattern
            for (int i = 1 ; i <= 4 ; i++) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
