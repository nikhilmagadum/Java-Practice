package PracticeFile;

public class Day1 {
    public  static  void  main(String[] args) {
        int a =  10;
        int b = 20;
        add(a , b);
        int res = sub();
        System.out.println(res);

    }
    static  void add(int a ,int b)
    {
        int c =  a + b;
        System.out.println(c);
    }
    static  int sub()
    {
        int c = 30;
        int d = 20;
        return c-d;
    }

}
