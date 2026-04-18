package PracticeFile;

import java.util.Scanner;

public class MultipleTillN {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the N value: ");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            if(i % a == 0 || i % b ==0){
                System.out.print(i + " ");
            }
        }
    }
}
