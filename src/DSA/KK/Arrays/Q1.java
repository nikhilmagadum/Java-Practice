package DSA.KK.Arrays;
import java.util.Scanner;
public class Q1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size:  ");


        int n =  sc.nextInt();

        System.out.println("Enter the Array elements:  ");
        int [] ar = new int[n];

        for(int i = 0; i<ar.length ;i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("The array elements entered are : ");
        for(int i = 0; i<ar.length/2;i++) {

            if (ar[i] % 2 == 0){
                System.out.print(ar[i] + " ");
            }
        }
    }
}
