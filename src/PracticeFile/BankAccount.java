package PracticeFile;

public class BankAccount {
    private float balance;
    private int cin;
    private String name;


    public void setBalance(float balance) {  // Setter method used to set the value
        if (balance >= 0) {   // To make it is accensible anywhere we use public
           this.balance = balance;
        }
    }
    public float getBalance() {  // Simlaryly to get the value we use getter method
        return balance;
    }
}
class Day15 {
    static void main(String[] args) {

        BankAccount ba   = new BankAccount();
        ba.setBalance(60000);

        System.out.println(ba.getBalance());
    }
}
