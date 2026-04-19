package OOPS.Constructors;

public class A {
    int age ;
    String name;
    //This is a special method that is called as constructor in java which has no return type not even void

    A() {
        age = 24;
        name = "Nikhil";
    }


    void show() {
        System.out.println(age + " " + name);
    }
}

//  in every class there will be a default constructor always

class B {
    static void main() {
        A obj = new A();   // here right next to the = symbol is only what it is called as constructor
        obj.show();
    }
}
