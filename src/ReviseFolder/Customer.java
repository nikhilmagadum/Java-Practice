package ReviseFolder;

public class Customer {

    private int cID;
    private String cName;
    private int cNum;

    public Customer() {
        cID = 12;
        cName = "Customer";
        cNum = 12345;
    }

    public int getCid() {
        return cID;
    }

    public String getCname() {
        return cName;
    }

    public int getcNum() {
        return cNum;
    }

    public Customer(int cID, String cName, int cNum) {

        this();
        this.cID = cID;
        this.cName = cName;
        this.cNum = cNum;

    }

    public Customer(String cName, int cNum) {
        this.cName = cName;
        this.cNum = cNum;
    }
}

class Demo {
    static void main() {
//        Customer c = new Customer();
//
//        System.out.println(c.getCid());
//        System.out.println(c.getcNum());
//        System.out.println(c.getCname());

        Customer c1 = new Customer(101, "BoB", 999);

        System.out.println(c1.getCid());
        System.out.println(c1.getcNum());
        System.out.println(c1.getCname());

    }
}
