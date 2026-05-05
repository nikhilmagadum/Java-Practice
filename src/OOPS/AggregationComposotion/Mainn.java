package OOPS.AggregationComposotion;


class Bike {
    String brand;
    float milage;

    public Bike(String brand,float milage) {
        this.brand = brand;
        this.milage = milage;
    }
}

class Heart {
    float weight;
    int bpm;

    public Heart(float weight,int bpm) {
        this.weight = weight;
        this.bpm = bpm;
    }
}

class Student {
    Bike bike;
    Heart heart;

    public Student() {  //wheneevr the Student Object is called the heart Object is created here in this
        heart = new Heart(500.8f,67);
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }


}

public class Mainn {
    public static void main(String[] args) {
       Student mystudent =  new Student();

       Bike  mybike = new Bike("Royalenfield" ,35.6f);

       mystudent.setBike(mybike);
        System.out.println(mystudent.heart.weight);
        System.out.println(mystudent.heart.bpm);

        System.out.println(mystudent.bike.brand);
        System.out.println(mystudent.bike.milage);

    }
}
