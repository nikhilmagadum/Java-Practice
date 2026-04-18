package PracticeFile;
import java.util.Scanner;
public class Power {
    static int calculatePower(int base, int exponent) {

        int power = 1;

        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }

        return power;
    }
    static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int base = scanner.nextInt();
                int exponent = scanner.nextInt();

                int res = calculatePower(base, exponent);

                System.out.println(res);

                scanner.close();
            }


}
