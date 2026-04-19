package OOPS.Encapsulation;

public class BankAccount {

  private float bal;
  private int cin;
  private String name;

  public void setBalance(float b) {
     //   if(b>=0) {
            bal =  b;
      //  }
    }

    public float getBalance() {
        return bal;
    }

  public  void setName(String n) {
      name = n;
  }

  public  String getName() {
      return name;
  }

  public void setCin(int c){
     cin =  c;
  }

  public int getCin() {
      return cin;
  }
}

