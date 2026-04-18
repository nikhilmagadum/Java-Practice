package NikhithaMam.Fundamentals;
import java.util.Scanner;
public class Age {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age :");
        int age = sc.nextInt();

        if (age >= 18  && age <= 60) {
            System.out.println("Adult");
        } else if (age < 18 && age >= 1 ) {
            System.out.println("Minor");
        } else if (age >= 60) {
            System.out.println("Senior");
        }
        else{
            System.out.println("Invalid Age number ");
        }
    }
}
