package DSA.KK.Arrays;

import java.util.Scanner;
public class Q10whichindex{

    public static int search(int[] ar,int k) {
//        for(int i =0 ;i <ar.length;i++) {
             for(int i = ar.length-1; i > 0 ; i--) {
            if(ar[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        int [] ar = new int[n];

        System.out.println("Enter the array elements : ");
        for(int i = 0; i< ar.length;i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("Enter the K value to find the index of that value : ");
        int k = sc.nextInt();

        int res = search(ar, k);
        System.out.println(res);

    }
}