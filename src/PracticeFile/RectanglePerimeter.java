package PracticeFile;

import java.util.Scanner;

public class RectanglePerimeter {
    static void main(String[] args) {
        Scanner  sc =  new Scanner(System.in);
        System.out.println("Enter the length of a rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter the width of a rectangle : ");
        int width = sc.nextInt();

        int perimeter =  2 * (length + width);  // formila to convert the rectangle into perimeter
        System.out.println("The Perimeter of a Rectangle is : " + perimeter);

    }
}
