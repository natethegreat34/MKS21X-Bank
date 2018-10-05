public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  public static void main(STring[]args) {}
public BankAccount(double ble, int aid, String pwd){
  balance = ble;
  accountID = aid;
  password = pwd;
}

public double getBalance(){
  return balance;
}

public int getAccountID(){
  return accountID;
}

public void setPassword(String newPass){
  password = newPass;
}

public String toString(){
  return balance + "\t" + accountID;
}

 public boolean deposit(double amount){
   if (amount > 0) {
     balance = balance + amount
     return true;
   }
   return false;}

 public boolean withdraw(double amount){
   if (balance >= amount && amount > 0) {
     balance = balance - amount;
     return true;
   }
   return false;
 }
