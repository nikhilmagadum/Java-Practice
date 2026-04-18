package PracticeFile;


import java.util.Scanner;

public class Dollar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double rupees = 82.73 * N;

        System.out.printf("The amount in Rupees are : %.4f", rupees);
    }
}
