package PracticeFile;

public class Shisya {
    String name ;
    int age;


    Shisya(String name , int age) {
        System.out.println("Shisya constructor");
    }

    public Shisya() {

    }


    void display(){
        System.out.println( name +" " + age);
    }
}
