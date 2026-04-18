package PracticeFile;

import java.util.Scanner;

public class Celciustofarenhiet {
    static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("program to find celcius to farenheit :");
        System.out.println();
        System.out.println("Enter the Celcius : ");
        int celcius = sc.nextInt();

        double farenheit = (celcius * (9.0/5.0)) + 32;

        System.out.println("The Farenheit after conversion from celcius is : " + farenheit );
    }
}
