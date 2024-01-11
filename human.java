/**human.java
  *OOP programming
  *@author Anthony Klytta
  *java 1.0 2/22/2023
  */


public class Human{
  
  private String firstName;
  private String lastName;
  private String Birthday;
  private String hairColor;
  private String eyeColor;
  private String Origin;
  private double Height;
  private double Weight;
  
  //Constructor. Always has the same name as the Class.
  public Human(String fn, String ln, String bday, String hair, String eyes, String continent){
    firstName = fn;
    lastName = ln;
    Birthday = bday;
    hairColor = hair;
    eyeColor = eyes;
    Origin = continent;
  }
  //setting the attributes
  public void setHeight(double newHeight){
    Height = newHeight;
    System.out.println("New height set");
  }
  public void setWeight(double newWeight){
    Weight = newWeight;
    System.out.println("New weight set");
  }
  public void setBirthday(String newBirthday){
    Birthday = newBirthday;
    System.out.println("New birthday set");
  }
  public void setHairColor(String newHairColor){
    hairColor = newHairColor;
    System.out.println("New hair color set");
  }
  public void setEyeColor(String newEyeColor){
    eyeColor = newEyeColor;
    System.out.println("New eye color set");
  }
  public void setOrigin(String newOrigin){
    Origin = newOrigin;
    System.out.println("New origin set");
  }
  public void setFirstName(String newFirstName){
    firstName = newFirstName;
    System.out.println("First name set");
  }
  public void setLastName(String newLastName){
    lastName = newLastName;
    System.out.println("Last name set");
  }
  //Getters
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public String getBirthday(){
    return Birthday;
  }
  public String getHairColor(){
    return hairColor;
  }
  public String getEyeColor(){
    return eyeColor;
  }
  public String getOrigin(){
    return Origin;
  }
  public double getHeight(){
    return Height;
  }
  public double getWeight(){
    return Weight;
  }
  
  public String toString(){
    s = "This is " + firstName + " " + lastName + " and they were born " + Birthday + "." + " They are from " + Origin + " and their eye color is: " + eyeColor + " and their hair color is: " + hairColor + " and their height and weight is: " + height + " " + weight ".";
  }
  //CREATING THE OBJECT, THIS IS THE INSTANCE.
  public static void main(String [] args){
    Human anyName = new Human("Anthony", "Klytta", "Sept 17", "Brown", "Blue", "North America");
    anthony.setHeight(5.10);
    anthony.setWeight(240.5);
    System.out.println(anyname.getFirstName() );
    anyName.setFirstName("Anthony");
    System.out.println(anyName.getFirstName());
    
  }
}
