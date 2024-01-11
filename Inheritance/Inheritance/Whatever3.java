

//to do list: Array Lists
//1) learn the get() function in array lists
//2) checking if keys within an array list exist using the containKey() function
//3) using the remove() function
//4) finding the size of the array lists using the size() function


//this program is mapping particular values from one list to another.
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Whatever3 extends WhateverInheritance{
  ArrayList<Integer> listOne = new ArrayList<>();
  ArrayList<Integer> listTwo = new ArrayList<>();
  ArrayList<Integer> emptyList = new ArrayList<>();

  public Whatever3(int number1, int number2){
    super(number1, number2);
  }

  public void intListGetFunction(){ //this function calls the element on the particular index of the array list
    int element  = intList.get(34);
    System.out.println(element);

  }
  public void appendElements(){ //overriding the appendElements method in the superclass
    intList.add(130);
  }
  public int intListSize(){ //tjis must be an int value because it is producing an integer
    return intList.size();
  }
  public int forLoopNumbers(){
    intList.clear();
    for (int i = 0; i < 10; i++){
      System.out.println(i);
      intList.add(i);
    }
    System.out.println(intList.size());
    return intList.size();
  }
  public int mergingLists(){
    for (int number1 = 0; number1 < 50; number1++){
      listOne.add(number1);
    }
    for (int number2 = 51; number2 < 100; number2++){
      listTwo.add(number2);
    }
    emptyList.addAll(listOne);
    emptyList.addAll(listTwo);
    System.out.println(emptyList);
    return emptyList.size();
  }


  public static void main(String[] args){
    Whatever3 whatever3 = new Whatever3(1, 2);
    // whatever3.loopIntElements(); //in order to ensure that the index of the array list is being called, this function must be used in order to loop the elements into the intList
    // whatever3.intListGetFunction();
    // whatever3.appendElements();
    // System.out.println(whatever3.intList);
    int size = whatever3.intListSize();
    System.out.println(size);
    System.out.println(whatever3.intList);
    int loopSize = whatever3.forLoopNumbers();
    System.out.println(loopSize);
    int mergedList = whatever3.mergingLists();
    // System.out.println(mergedList);

  }
}
