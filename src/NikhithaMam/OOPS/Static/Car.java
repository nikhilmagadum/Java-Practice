package NikhithaMam.OOPS.Static;

public class Car {
    private String name ;

    public String getName() {
        return name;
    }
}
class Demo{
    static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getName());
    }
}