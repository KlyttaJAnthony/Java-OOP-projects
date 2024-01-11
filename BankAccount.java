/** BankAccount.java 
  * @description A class for bank accounts
  * @author S Jamshidi
  * @date 2023-02-22, version 1.0
*/

public class BankAccount{

  // attributes
  private String firstName, lastName, middleName;
  private final static String BANK_NAME = "Boomer Bank";
  private double balance, interestRate;
  private final long ACCOUNT_NUMBER; 
  private final static long ROUTING_NUMBER = 1234567890L; // for a long
  private static int accountCounter = 0;
  
  // methods
  public BankAccount(String fName, String lName, String mName, double startingBalance){
    
    firstName = fName;
    lastName = lName;
    middleName = mName;
    balance = startingBalance;
    ACCOUNT_NUMBER = 1000000000L + accountCounter++; 
    // update number of objects associated to class
  }
  
  // What if you don't have a middle name?
  // we use is method overloading
    public BankAccount(String fName, String lName, double startingBalance){
    
    firstName = fName;
    lastName = lName;
    // middleName = ""; // without this, middleName will be the null object
    balance = startingBalance;
    ACCOUNT_NUMBER = 1000000000L + accountCounter++; 
    // update number of objects associated to class
  }
  
  // we do this when you have a default value for some fields
  // Java distinguished multiple versions of a method using the 
  // signature. So if you pass BankAccounts("A", "B", 10.0), the second
  // constructor is called because it is two strings and a double
  
  /** getter for number of accounts */
  public int numberOfAccounts(){
    return accountCounter;
  }
  
  /** getter for number of accounts */
  public static int numOfAccounts(){
    return accountCounter;
  }
  
  public static void main(String[] args){
    BankAccount test = new BankAccount("Sara", "Jamshidi", 100.10);
    System.out.println(test.numberOfAccounts()); // should print 1
    System.out.println(BankAccount.numOfAccounts()); // calling static method; also prints 1
  }
  
}