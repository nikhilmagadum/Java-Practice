package PracticeFile;

class Student {
    int id;
    String name;

    // Normal constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }
}

public class Mainn {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Nikhil");
        Student s2 = new Student(s1);  // Copy constructor

        System.out.println(s2.id + " " + s2.name);
    }
}