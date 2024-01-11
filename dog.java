/** Dog.java
  * author A Klytta
  *Version 1.0 2/17/23
  *@description a class that stores information on dogs
  */


//create the dog class
//make it public (global)

public class Dog{
  
  //attributes
  private String breed, color, heatlhHistory, name, notes, temperment;
  private char sex, size;
  private int age, idTag, weight;
  
  //method, constructor
  /** constructor for Dog class*/ 
  public Dog(String lName, String breed, char lSex, int age){
    name = lName;
    this.breed = breed; //this prefix refers to this instance, meaning that this. prefix will link this attribute to this methods variable.
    this.sex = lSex;
    this.age = age;
    
  }
  /** resets the size attribute */ 
  public void setSize(char newSize){
    size = newSize
  }
  /** returns the size attribute */ 
  public char getSize(){
    returns size;
  }
  
  /** main method for testing */
  //static 
  public static void main(String[] args){
    Dog finn  = new Dog("Finn", "English Mastiff", 'M', 7):
    
    //TEST 1:
    finn.setSize('L');
    
    //print the information....
  }
  
}