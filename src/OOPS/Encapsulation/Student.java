package OOPS.Encapsulation;

public class Student {
    int id;
    String name;
    int age;

    Student() {

    }


    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }
    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}

class Mine {
    static void main() {
        Student s1 = new Student(101,"Nikhil",24);
        s1.display();
        Student s2 = new Student();
        s2.display();
    }
}
