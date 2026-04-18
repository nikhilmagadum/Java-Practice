package PracticeFile;

import java.util.Scanner;

public class StringExample {

    static String greet() {
        String greeting = "Hello Nikhil How are you ? ";
        return  greeting;
    }

    // this methods below is for the String  with parameters
   static String myGreet(String name) {
      String message  = "Hello " + name;
      return  message;
 }

    static void main(String[] args) {

        String message = greet();
        System.out.println(message);
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your name : ");

        String name  = sc.next();
        String personlised  = myGreet(name);
        System.out.println(personlised);

    }
}





