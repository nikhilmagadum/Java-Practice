package DSA.Arrays;
import java.util.Scanner;
public class ThreeD {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int [][][] a  = new int [2][3][5];
        int i,j,k;

        //This loop is to take the input
        for (i = 0; i < 2 ; i++) {
            for(j = 0;j < 3; j++) {
                for (k = 0; k < 5; k++){
                    System.out.println("Schoool : " + i + " Class : " + j + " Students : " + k );

                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        //To show proper output
        System.out.println("The ages are : ");

         // this loop for printing
        for (i = 0; i < 2 ; i++) {
            for(j = 0;j < 3; j++) {
                for (k = 0; k < 5; k++){
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println(); // tHis line is when clasroom changes
            }
            System.out.println(); // this line is when school changes
        }
    }
}
/* This is also called as 3D array
This is called as regular array only
Note : This is not a Jagged Array

 */