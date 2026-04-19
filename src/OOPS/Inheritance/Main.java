package OOPS.Inheritance;

class Student {
    String name;
    int age;

    // Constructor 1
    Student() {
        this("Unknown", 0);  // calling another constructor
    }

    // Constructor 2
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
