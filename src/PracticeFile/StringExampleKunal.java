package PracticeFile;

public class StringExampleKunal {

   public static void main(String[] args) {

         String message = greet();
        System.out.println(message);

        String personalMessage = myGreet("NikhilMagadum");
        System.out.println(personalMessage);

    }

    static String myGreet (String name) {

        String message  = "hello " +  name ;
        return  message;

    }

    static  String greet() {
        String greeting  = "how are you ? ";
        return greeting;
    }

}
