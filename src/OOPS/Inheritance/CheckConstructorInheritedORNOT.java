package OOPS.Inheritance;

class CheckConstructor {

    CheckConstructor() {
        System.out.println("This is Constructor");
    }

    CheckConstructor(int age,String name) {
        System.out.println("Name : " + name + " Age : " + age);
    }
}

class Hosadhu extends CheckConstructor {

// Constructor are not inherited in Java

}

public class CheckConstructorInheritedORNOT {
    public static void main (String[] args) {
         CheckConstructor c1 = new CheckConstructor();
         CheckConstructor c2 = new CheckConstructor(22,"Nikhil");


         Hosadhu h1 = new Hosadhu();


    }

}
