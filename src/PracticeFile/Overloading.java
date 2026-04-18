package PracticeFile;

public class Overloading {
    static void main(String[] args) {

        fun(22);
        fun("Nikhil");

    }

    static  void fun(int a )
    {
        System.out.println("i am example for  method PracticeFile.Overloading!");
    }

    static  void fun(String name)
    {
        System.out.println( "Hello " + name);
    }


}
