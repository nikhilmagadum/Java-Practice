package OOPS.Constructors;
// constructor Overloading
class OveraLoda {
    int age ;
    String name ;
    String College ;
    double salary;
    // A class having more than one constructor  with diff para or order is called as Constructor overloading
    OveraLoda() {
        System.out.println("HI hello");
        age =  24;
        name = "Nanda";
        College = "CMR University";
        salary = 50000.97;
    }
    OveraLoda(int age, String name, String College , double salary) { //  constructor with 3 parameters
        this.age = age;
        this.name = name;
        this.College = College;
        this.salary = salary;
    }
    OveraLoda(int age ) { // constructor with one parameter
        name  = "Satish";
        College = "RV College";
        salary = 766633;
        this.age = age;
    }
    OveraLoda(int age, String name ) {
        this.age = age;
        this.name = name;
    }

    void show () {
        if(age > 20){
            System.out.println("Age: " + age + " " + name);
            System.out.println("College: " + College + " " + salary);
        }
    }
}

public  class OV {
    static void main() {
        System.out.println("Program to Learn Constructor :");
        OveraLoda load1 = new OveraLoda();
        OveraLoda load2 = new OveraLoda(25);
        load2.show();
//        System.out.println(load1.age);
//        System.out.println(load1.name);
//        System.out.println(load1.salary);
//        System.out.println(load1.College);
    }
}

