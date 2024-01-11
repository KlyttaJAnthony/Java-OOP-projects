/**
  *This is the first program from the book by Ray Horstman.
  *@version 1 2023-05-15
  *@author Anthony Klytta
  */



public class SimpleProgram{

  //int TotalCards; //this must have an initialized value
  int TotalCards = 12; //perfectly normal
  TotalCards = 100; //legal as well, just as long as the type and variable is declared, and or the value initialized
  e

  public static final double NEW_NUMBER = 50.95; //creating a class constant

  public static void main(String [] args){
    final String commanderCard = "Avacyn, Angel of Hope";
    double powerToughness = 8.8;
    System.out.println("Here is my commander: " + commanderCard + " and here is the power and toughness of her: " + powerToughness);

    //
    enum Size {SMALL, MEDIUM, LARGE, X_LARGE}; //using the enum type. Somewhat like a list but only used for specific amount of set values.
    Size s = Size.MEDIUM;
    //

    //
    double x = 9.997; //converting 9.997 into an integer
    int nx (int) x; //casting double x into an int into nx, converts to only 9.
    //

    //
    double y = 9.997;
    int ny = (int) Math.round(y); //the rounded value would be 10, you would still need to use the int type because the default converted type would be long.
    //

    //
    o+=4;
    0 = 0 + 4; //these two statements are the exact same
    //
    

    System.out.println("We will not use hello world here.");
  }
}
