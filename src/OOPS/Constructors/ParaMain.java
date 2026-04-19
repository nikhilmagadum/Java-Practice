package OOPS.Constructors;

class Para {
    int id ;
    String name;
    Boolean res;
    String college;
     Para(int id , String name) {  // this is called as a parameterized constructor
        this.id = id;
        this.name = name;
     }

     Para(int id ) { ///  SO here if we pass only  int then default value for string  will be null and that will be displayed
         name  = "Ekpal";
         // You can asisgn the value here in this particular  constructor and the use it
         // Or else in void show it will print as null for the name  in SOP statement
         this.id = id;
     }

      void show() {
         System.out.println(id + " " + name);
      }
}

public  class ParaMain {
    static void main(String[] args) {
        Para p =  new Para(25,"Nikhil");
        p.show();
        Para n = new Para(100);
        n.show();
    }
}