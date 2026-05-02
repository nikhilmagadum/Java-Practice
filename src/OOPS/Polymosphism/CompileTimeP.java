package OOPS.Polymosphism;

public class CompileTimeP {
//    Same method name, different parameters // Compile Time Polymorphism
    public static int add(int a ,int b) {
        return a + b;
    }

    public static int add(int a ,int b ,int c) {
        return a + b + c;
    }
}

class Main {
    public static void main(String[] args) {


     CompileTimeP ctp = new CompileTimeP();  // same class and same object is called as tight coupling

     ctp.add(20,30);    /// Decides which method to call from user input here This is called as compile time Poly


    }
}