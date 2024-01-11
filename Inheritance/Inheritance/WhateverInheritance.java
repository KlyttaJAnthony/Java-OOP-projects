

//to do list: Array Lists
//1) learn the get() function in array lists
//2) checking if keys within an array list exist using the containKey() function
//3) using the remove() function
//4) finding the size of the array lists using the size() function

//to do list: Collections
//1) sorting collections using the Collections.sort() function
//2) finding the minimum and maximum values using Collections.min() and Collections.max()
//3) reversing the order of the collections using Collections.reverse()
//4) searching for elements using Collections.binarySearch()

//to do list: Hash Map
//1) insert key-value pairs using the put() function
//2) retrieving values associated with a key using the get() function
//3) checking if a key exists using the containsKey() function
//4) removing a key-value pair using the remove() function
//5) understanding hash functions and collision resolution techniques

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class WhateverInheritance{
  protected int number1;
  protected int number2;
  protected List<String> stringList = new ArrayList<>(); //declaring two array lists, one being for ints and the other for Strings initializing for inheritance use
  protected List<Integer> intList;

  public WhateverInheritance(int number1, int number2){
    this.number1 = number1;
    this.number2 = number2;
    stringList = new ArrayList<>();//no elements here, only initilizing
    intList = new ArrayList<>();
  }
  public void addingToStringList(String stringElement){ //remember, the void declaration is used to create an action but not return anything
    stringList.add(stringElement);//adding string elements to the array list
  }
  public void addingToIntList(int intElement){
    intList.add(intElement); //adding integer elements to the array list
  }
  public List<String> getMyStringList(){
    return stringList;
  }
  public List<Integer> getMyIntList(){
    return intList;
  }
  // public void loopIntElements(){
  //   Random random = new Random(200); //this seed value suggests for 200 random numbers.
  //   for (int i = 0; i < 100; i++){ //adding 100 integer elements into the list.
  //     int randomInt = random.nextInt(200) + 1; //generate random elements between 1 and 200
  //     intList.add(randomInt); //add it to the int array list.
  //   }
  //   System.out.println(intList);
  // }
  //

  public void loopIntElements(){
    for (int i = number1; i < 100 + number1; i++){ //the value key word is being called from the whateverInheritance.number1 parameter in the creating of object method
      intList.add(i);
    }
    System.out.println(intList);
  }
  public void shuffleIntList(){
    Collections.shuffle(intList); //shuffles the elements within a list
  }
  // public void deleteElements(){
  //   intList.clear(); //deletes all the elements within a list
  // }
  public void appendElements(){ //this appends elements to the list, in (index, element) notation.
    intList.add(101);
  }
  public String toString(){
    return number1 + " " + number2;
  }


  public static void main (String[] args){
    WhateverInheritance whateverInheritance = new WhateverInheritance(1, 2); //since these are referenced in the constructor we need to add values
    // whateverInheritance.loopIntElements(whateverInheritance.number1);
    int count = whateverInheritance.intList.size(); //counting the size of the intList
    System.out.println(count);
    // whateverInheritance.shuffleIntList();
    // System.out.println(whateverInheritance.intList);
    // whateverInheritance.deleteElements();
    System.out.println(whateverInheritance.intList);
    whateverInheritance.appendElements();
    System.out.println(whateverInheritance.intList);

  }
}
