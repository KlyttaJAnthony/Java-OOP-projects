



public class Whatever2 extends WhateverInheritance{


  public Whatever2(){
    super(25, 50);
  }
  public void numberCalling(){
    System.out.println(number1 + " " + number2);
  }
  public void newNumber(){
    int newNumber1 = number1 + number2;
    System.out.println(newNumber1);
  }
  public void conditionalNumber(){
    if (number1 <= 30){
      System.out.println("oop, looks like we got to loop it.");
      for (; number1 <= 30; number1++){
        System.out.println(number1);
      }
    }else{
      System.out.println(number1);
    }
  }
  public static void main(String[] args){
    Whatever2 whatever2 = new Whatever2();
    whatever2.numberCalling();
    whatever2.newNumber();
    whatever2.conditionalNumber();
  }
}
