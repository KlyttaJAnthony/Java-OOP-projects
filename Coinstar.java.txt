/** Coinstar.java
  * @description A solution for homework 1
  * @author S Jamshidi
  * @version 1.0 2022-09-23
*/

import java.util.Scanner;

public class Coinstar{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int pennies = 0; // starting value

    // Take in information from the user
    //Currency is converted into pennies first
      //quarters
      System.out.print("Enter the number of quarters: ");
      int coins = input.nextInt();
      pennies += coins*25; //each quarter is worth 25 cents

      //dimes
      System.out.print("Enter the number of dimes: ");
      coins = input.nextInt();
      pennies += coins*10; //each dime is worth 10 cents

      //nickels
      System.out.print("Enter the number of nickels: ");
      coins = input.nextInt();
      pennies += coins*5; //each nickel is worth 5 cents

      //pennies
      System.out.print("Enter the number of pennies: ");
      coins = input.nextInt();
      pennies += coins; //each penny is worth 1 cent

    // display total value of money
      System.out.println("\nYou have a total of: " + pennies / 100.0 + "\n");


    // cash out into smaller bills
      System.out.println("We will now return the same value in largest bills");
      String s = "";

      //$100 bills
      if (pennies >= 20000){
        s += pennies/10000 + " -- $100 bills \n";
        pennies = pennies % 10000;
      }else if (pennies > 10000){
        s += "1 -- $100 bill \n";
        pennies = pennies % 10000;
      }

      //$50 bills
      // NOTE: You can never have more than 1 $50, why?
      if (pennies >= 5000){
        s += "1 -- $50 bill \n";
        pennies = pennies % 5000;
      }

      //$20 bills
      // NOTE: You can have at most 2 $20
      if (pennies >= 4000){
        s += "2 -- $20 bills \n";
        pennies = pennies % 2000;
      }else if (pennies > 2000){
        s += "1 -- $20 bill \n";
        pennies = pennies % 2000;
      }

      //$10 bills
      // NOTE: You can never have more than 1 $10
      if (pennies >= 1000){
        s += "1 -- $10 bill \n";
        pennies = pennies % 1000;
      }

      //$5 bills
      // NOTE: You can never have more than 1 $5
      if (pennies >= 500){
        s += "1 -- $5 bill \n";
        pennies = pennies % 500;
      }

      //$1 bills
      if (pennies >= 200){
        s += pennies/100 + " -- $1 bills \n";
        pennies = pennies % 100;
      }else if (pennies > 100){
        s += "1 -- $1 bill \n";
        pennies = pennies % 100;
      }

      //Quarters
      if (pennies >= 50){
        s += pennies/25 + " -- Quarters \n";
        pennies = pennies % 25;
      }else if (pennies > 25){
        s += "1 -- Quarter \n";
        pennies = pennies % 25;
      }

      //Dimes
      if (pennies >= 20){
        s += "2 -- Dimes \n";
        pennies = pennies % 10;
      }else if (pennies > 10){
        s += "1 -- Dime \n";
        pennies = pennies % 10;
      }

      //Dimes
      if (pennies >= 20){
        s += "2 -- Dimes \n";
        pennies = pennies % 10;
      }else if (pennies > 10){
        s += "1 -- Dime \n";
        pennies = pennies % 10;
      }

      //Nickels
      if (pennies >= 5){
        s += "1 -- Nickel \n";
        pennies = pennies % 5;
      }

      //Pennies
      if (pennies >= 2){
        s += pennies + " -- Pennies \n";
        pennies = pennies % 1;
      }else if(pennies == 1){
        s += "1 -- Penny \n";
        pennies = pennies % 1;
      }

      System.out.println(s);

  }//end of main method
}//end of class
