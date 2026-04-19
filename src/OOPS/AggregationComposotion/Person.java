package OOPS.AggregationComposotion;

public class Person {
    protected String name;
    protected int age;
    private Brain brain; // Composition
    private Bike bike;   // Aggregation

    public Person(String name, int age, String brainNerves) {
        this.name = name;
        this.age = age;
        // Composition: Brain is created when Person is created
        this.brain = new Brain(brainNerves);
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public void displayInfo() {
        System.out.println(name + " (" + age + ") has a brain with " + brain.getNerves());
        if (bike != null) {
            System.out.println("This person owns a bike.");
        }
    }
}
