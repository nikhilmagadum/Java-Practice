package PracticeFile;

import java.util.Scanner;

public class SquarePerimeter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter the side size  of a square :  ");
        int N = sc.nextInt();

        int perimeter = 4 * N;

        System.out.println("The perimeter of a perfect Square is : " + perimeter);

    }
}
