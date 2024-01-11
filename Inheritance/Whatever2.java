

public class Whatever2 extends WhateverInheritance{


  public Whatever2(){
    super(25, 50);
  }
  public void numberCalling(){
    System.out.println(numbers + " " + number2);
  }
  public static void main(String[] args){
    Whatever2 whatever2 = new Whatever2;
    whatever2.numberCalling();
  }
}
