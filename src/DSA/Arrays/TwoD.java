package DSA.Arrays;

import java.util.Scanner;
public class TwoD {
// program to store the ages of students in the classroom
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating a two dimensional Array  // 2 classroom and 5 students in the classroom
        int[][] a = new int[2][5];

        // This loop for taking the input
        for(int i = 0; i < 2;i++) {
            for(int j =0;j<5 ;j++) {
                System.out.println("Enter the classroom  : " + i + " the students in the classroom are : " + j);
                a[i][j] = sc.nextInt();
            }
        }
        //this n loop is for printing the output
        System.out.println("The ages are : ");
  int sum = 0;

        for(int i = 0; i < 2;i++) {
            for(int j =0;j<5 ;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
