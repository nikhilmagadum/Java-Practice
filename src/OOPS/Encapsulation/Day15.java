package OOPS.Encapsulation;

public class Day15 {
    static void main(String[] args) {

        BankAccount ba = new BankAccount();

        System.out.println(ba.getBalance());

        ba.setBalance(10000);
        System.out.println(ba.getBalance());
        ba.setName("Nikhil");
        System.out.println(ba.getName());
        ba.setCin(2445);
        System.out.println(ba.getCin());
    }
}
