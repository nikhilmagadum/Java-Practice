package NikhithaMam.OOPS.Inheritance;

class Person {
    String name;

    void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }
}

class Professor extends Person {
    String department;

    void conductLecture() {
        System.out.println(name + " is conducting a lecture.");
    }
}

public class In {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Harish Pathak";
        professor.department = "Computer Science";

        System.out.println("Professor Name: " + professor.name);
        System.out.println("Department: " + professor.department);

        professor.introduce();
        professor.conductLecture();
    }
}
