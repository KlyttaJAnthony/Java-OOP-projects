/** toddler.java
  *@description stores data for toddlers
  *@author A Klytta
  *version 1.0, 2023-02-13
*/

public class Toddler{
  
  
  // attributes
  //private attribute only allows for the access within this class.
  // these are called access modifiers.
  private String firstName;
  private String lastName;
  private String birthday;
  
  // methods
  
  /** below is the constructor for the class */
  public Toddler(String fn, String ln, String bday){
    firstName = fn;
    lastName = ln;
    birthday = bday;
    
  }
  
  // setters allow us to change the values of the attributes
  
  /** sets the first name attribute */
  
  public void setFirstName(String newFirstName){
    firstName = newFirstName;
    System.out.println("first name updated!");
    
  }
  public void setLastName(String newLastName){
    lastName = newLastName;
    System.out.println("second name updated!");
    
  }
  
  public void setBirthday(String newBirthday){
    birthday = newBirthday;
    System.out.println("birthday updated");
  }
  
  public string getFirstName(){
    return firstName;
  }
  public string getLastName(){
    return lastName;
  }
  public string getBirthday(){
    return Birthday;
  }
  //translates object to string
  public String toString(){
    s = "This is " + firstName + " " + lastName + " and they were born " + birthday + ".";
  return s;
  }
  
  /** Tests */
  public static void main(String[] args){
    Toddler anyName = new Toddle("First Name", "Last Name", "Birthday");
    //testing FirstName attribute methods
    System.out.println(anyName.getFirstName() ); //see first name on terminal
    anyName.setFirstName("Kevin"); // first name will be updated
    ystem.out.println(anyName.getFirstName() );
  
  }
  
}