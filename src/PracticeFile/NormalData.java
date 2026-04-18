package PracticeFile;

import java.util.Scanner;

public class NormalData {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the AGE : ");
        int age = sc.nextInt();
        System.out.println("Enter the Percentage  :");
        float perc = sc.nextFloat();
        System.out.println("Enter the College : ");
        sc.nextLine();
        String college = sc.nextLine();

        System.out.println(college.length());
        System.out.println(perc);
        System.out.println(age);

        sc.close();

    }
}
