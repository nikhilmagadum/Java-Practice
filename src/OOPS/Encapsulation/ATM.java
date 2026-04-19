package OOPS.Encapsulation;

public class ATM {

        private double balance = 1000;   // hidden data

        public void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
         //   System.out.println("Balance: " + balance);
        }

        public void withdraw(double amount) {
            if(amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        public void checkBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

