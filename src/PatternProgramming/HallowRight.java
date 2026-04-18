package PatternProgramming;

public class HallowRight {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            for (int k = 5; k >= j; k--) {
                if(j == 1 || j == 3 || j ==2 || j == 4 || j == 5) {
                    System.out.print(" ");
                }
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
