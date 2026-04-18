package NikhithaMam.OOPS.Encapsulation;

public class Nikhil {
    public static void main(String[] args) {

        ATM user = new ATM();

        user.checkBalance();
        user.deposit(500);
         user.withdraw(300);
         user.checkBalance();
    }
}
