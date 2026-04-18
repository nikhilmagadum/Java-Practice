package PracticeFile;

public class Test {

    int age ;
    String name;

    void show() {
        System.out.println(age + " " + name);
    }
}

class Demo {
    static void main(String[] args) {
        System.out.println("Program to create a sample class and onject");
        System.out.println("===========================================");

        Test t =  new Test();
        t.show();
        t.name =  "Nikhil";
        t.age = 19;
        t.show();
    }
}
