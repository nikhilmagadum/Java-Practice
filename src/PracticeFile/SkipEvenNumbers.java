package PracticeFile;
import java.util.Scanner;

public class SkipEvenNumbers {
    static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int maxNumber = scanner.nextInt();

                for (int i = 1; i <= maxNumber; i++) {
                    if ( i % 2 == 0) {
                        continue;
                    }
                    System.out.println(i);
                }
            }
        }

