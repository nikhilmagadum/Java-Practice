package NikhithaMam.Fundamentals;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your country: ");
        String country = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        switch(country) {
            case "india":
                if(age >= 18) {
                    System.out.println("You are eligible to vote in India.");
                } else {
                    System.out.println("You are not eligible to vote in India.");
                }
                break;

            default:
                System.out.println("You are not an Indian citizen.");
        }
    }
}
