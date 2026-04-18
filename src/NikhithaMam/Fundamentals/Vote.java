package NikhithaMam.Fundamentals;
import java.util.Objects;
import  java.util.Scanner;
public class Vote {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nationality: ");
        String nation =  sc.next();
        System.out.println("Enter the Age : ");
        int age = sc.nextInt();

        if(Objects.equals(nation, "Indian")){
            System.out.println("You are eligible to vote in india");
            if(age > 18){
                System.out.println("You are above 18 you are indian and you are eligible to vote");
            }else {
                System.out.println("You are indian  but you are not eligle to vote bcz you are minor .");
            }
        }else{
            System.out.println("You are not eligible and hence you are not eligible to vote ..");
        }
    }
}
