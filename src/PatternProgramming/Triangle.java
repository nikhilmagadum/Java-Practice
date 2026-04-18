package PatternProgramming;

public class Triangle {
    static void main(String[] args) {

//                for(int i = 1; i <= 5 ; i++) {
//                    System.out.print(" ");
//                    for(int j = 5; j <= i; j++) {
//                        System.out.print(" * ");
//                        for (int k = 1; k <= i; k++) {
//                        }
//                        System.out.println();
//                    }}}

        for(int j = 1;j<=5 ; j++) {
            for(int k = 5; k>=j;k--) {
                System.out.print(" ");
            }
            for(int i = 1;i<=j;i++){
                System.out.println("* ");
            }
            System.out.println();
        }

    }
}



