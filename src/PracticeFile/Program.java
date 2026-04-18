package PracticeFile;

public class Program {
    // This is a Static Block
    static {
        System.out.println("This a static method");
    }
    // this is a NON static Block
   {
       int age =  24;
       System.out.println("age : " +age);
        System.out.println("Non Static Block ");
    }

    Program () {
        System.out.println("This is a constructor execeuted ");
    }
}

