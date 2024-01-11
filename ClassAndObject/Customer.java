/**
  *Customer
  *@version 1 2023-05-15
  *@author Anthony Klytta
  */
public class Customer{

  private String Name;
  private String Email;
  private double CreditLimit;


  public Customer(){
    this("Nobody", "nobody@gmail.com"); //
  }

  public Customer(String Name, String Email){
    this(Name, Email, 12000.0); //passing the customer object through the constructor
    // this.Name = Name;
    // this.Email = Email;
  }

  public Customer(String Name, String Email, double CreditLimit){
    this.Name = Name;
    this.Email = Email;
    this.CreditLimit = CreditLimit;
  }
//the first Customer constructor runs the variables through the initialized variables within the second one, this is why we can print 12K from it.

  public String getName(){
    return Name;
  }
  public String getEmail(){
    return Email;
  }
  public double getCreditLimit(){
    return CreditLimit;
  }
  public static void main (String[] args){
    // Customer customer = new Customer("Anthony", "klyttaanthony@gmail.com", 1000.0);
    // System.out.println(customer.getName());
    // System.out.println(customer.getEmail());
    // System.out.println(customer.getCreditLimit());
    //
    // Customer customer2 = new Customer(); //passing a new instance of an object.
    // System.out.println(customer2.getName());
    // System.out.println(customer2.getEmail());
    // System.out.println(customer2.getCreditLimit());
    //
    // Customer customer3 = new Customer("Joe", "Joe@email.com");
    // System.out.println(customer3.getName());
    // System.out.println(customer3.getEmail());
    // System.out.println(customer3.getCreditLimit());

    Customer customer4 = new Customer("Max", "max@email.com");
    System.out.println(customer4.getName());
    System.out.println(customer4.getEmail());
    System.out.println(customer4.getCreditLimit());


  }
}
