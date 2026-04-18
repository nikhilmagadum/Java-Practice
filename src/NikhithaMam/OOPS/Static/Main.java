package NikhithaMam.OOPS.Static;
// Static variable
class Student {
    String name;
    static String college = "Kodnest"; //  here this static variable belong to the class not  to any objects
}
 class Teacher extends Student {
    static String college;
 }

public class Main {
     public static void main(String[] args) {
         Student s1 = new Student();
         s1.name="NikhiL magadum";
         Student s2 = new Student();
         s2.name = "Abhishek";
//         System.out.println(s1.name + " from " + Student.college);
//         // to access the static variable use the class name
//         // not the object name
//         System.out.println(s2.name + " from " + Student.college);

         System.out.println(s1.name + " from " + Student.college);
     }
}
