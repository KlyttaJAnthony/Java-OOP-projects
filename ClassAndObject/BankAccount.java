/**
  *Bank Account
  *@version 1 2023-05-15
  *@author Anthony Klytta
  */

public class BankAccount{
  private int Number;
  private double Balance;
  private String PhoneNumber;
  private String Name;
  private String Email;

  public BankAccount(){
    this(92843, 32.50, "Default Name", "Default Address", "Default Phone"); //calling from the second Constructor
                                                                           //This must be first before the print statemenmt.
    System.out.println("Empty constructor called."); //this constructor will be called first.
  }
  public BankAccount(int Number, double Balance, String Name, String CustomerPhoneNumber, String CustomerEmail){
    System.out.println("Account Constructor with parameters called");
    this.Number = Number;
    this.Balance = Balance;
    this.Name = Name;
    PhoneNumber = CustomerPhoneNumber;
    Email = CustomerEmail;
  }

  // public int getNumber(){
  //   return Number;
  // }
  // public double getBalance(){
  //   return Balance;
  // }
  // public long getPhoneNumber(){
  //   return PhoneNumber;
  // }
  // public String getName(){
  //   return Name;
  // }
  // public String getEmail(){
  //   return Email;
  // }
  // public void setNumber(int Number){
  //   this.Number = Number;
  // }
  // public void setBalance(double Balance){
  //   this.Balance = Balance;
  // }
  // public void setPhoneNumber(long PhoneNumber){
  //   this.PhoneNumber = PhoneNumber;
  // }
  // public void setName(String Name){
  //   this.Name = Name;
  // }
  // public void setEmail(String Email){
  //   this.Email = Email;
  // }
  public void depositFunds(double depositAmount){
    Balance += depositAmount;
    System.out.println("Deposit Amount: " + depositAmount + " from balance: "  +this.Balance);
  }
  public void withdrawFunds(double withdrawAmount){
    if(Balance - withdrawAmount < 0){
      System.out.println("Insufficient funds, there is only: " + Balance  + " within the account.");
    }else{
      Balance -= withdrawAmount;
      System.out.println("Withdrawal of $" + withdrawAmount + "processed: remaining balance = $" + Balance);
    }
  }
  //remember, the notation is class.method
  public static void main(String[] args){
    BankAccount myAccount = new BankAccount(12345, 10000.00, "Anthony", "7737503360", "klyttaanthony@gmail.com");
    System.out.println(myAccount.getNumber());
    System.out.print(myAccount.getBalance()); //using multiple constructors is called constructor overloading
    myAccount.withdrawFunds(100.0); //this is seen here, observe the object deliniated from the class and then the method using the parameters of it.
    myAccount.depositFunds(250.0);
    myAccount.withdrawFunds(50.0);

  }
}
