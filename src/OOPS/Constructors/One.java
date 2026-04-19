package OOPS.Constructors;
// Program to check how constructor works
public class One {
    int age;
    String name;

    One () {
        System.out.println("Hello this is Default constructor.");
        age = 25;
        name = "Nikhil";
    }

    void show() {
        System.out.println(age + " " + name);
    }

}
class Main {
    public static void main(String[] args) {

        One one =  new One();
        one.show();
        One two =  new One();
        two.show();
    }
}
