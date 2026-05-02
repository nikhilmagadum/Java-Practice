package DSA.KK.Arrays;
import java.util.Scanner;

public class Q6MaximumElementArray {

   public static int maximum(int[] ar) {
//       int max = 0;
       int max = ar[0];
        for(int i = 0; i < ar.length;i++) {
            if(ar[i] > max) {
                max = ar[i];
            }
        }
       return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arry size: ");
        int n = sc.nextInt();


        int[]  ar = new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i = 0;i<ar.length;i++) {
            ar[i] =  sc.nextInt();
        }

        int Maximum_value = maximum(ar);
        System.out.println(Maximum_value);

    }
}
