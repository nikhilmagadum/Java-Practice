package OOPS.AggregationComposotion;

public class Charger {

    String brand;
    float voltage;

    public Charger(String brand,float voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }
}

class OS {
    String name;
    float size;

   public OS(String name,float size) {
        this.name =  name;
        this.size = size;
    }
}

class Mobile {
    Charger charger; /// creating an instance variable of class Charger
    OS os;           // creating an instance variable of class OS
    // has - A relationship is established just by creating the both the variables of those class types

   public Mobile() {
        os = new OS("Lollipop" ,423.11f);
    }

    // Aggregation is achieved by setters methods
    public void setCharger(Charger charger) {
       this.charger = charger;
    }


}

class Main {
    public static void main(String[] args) {
        Mobile MyMobile = new Mobile();

        System.out.println(MyMobile.os.name);
        System.out.println(MyMobile.os.size);


       Charger myCharger  =  new Charger("mi",40.2f);

        System.out.println(myCharger.brand);
        System.out.println(myCharger.voltage);

        MyMobile.setCharger(myCharger);

    }
}

