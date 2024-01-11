/** player.java
  *@description Player object for the rock paper scissors game
  *@version 1.0 2/27/2023
  *@author Anthony J Klytta
  */

import java.util.Random;
public class Player{
  
  //attributes
  private char action;
  private boolean human; //true if human, false if computer
  private int wins;
  private String name;
  
  //methods 
  
  /**constructor */
  public Player(boolean human, String name){
    this.human = human;
    this.name = name;
  }
  /**constructor -- no name */
  public Player(boolean human){
    this.human = true;
    this.name = "";
  }
  /**constructor -- default of human and no name */
  public Player(){
    human = true;
    name = "";
  }
  /**getter for name attribute **/
  public String getName(){
    return name;
  }
  /** setter for name attribute */
  public void setName(String name){
    this.name = name; //this. references the global variable that the object will use to reference the set variable to other methods
  }
  
  /**Getter for the number of wins*/
  public void getWins(){
    return wins;
  }
  
  /**setter for wins*/
  public void incrementWins(){
    wins++;
  }
  
  
  /** sets action randomly*/
  public boolean setAction(String action){ //FOR HUMANS
    char actionChar = action.toUpperCase().charAt(0);
    
    //conditional statement
    if (actionChar  == 'R' || actionChar == 'P' || actionChar == 'S'){
      this.action = actionChar; // is this OK?
      return true;
    }else{
      return false;
    }
  }
  /**sets action randomly*/
  //FOR COMPUTERS: these two lines of code provide the letters R, P, and S into a array
  public boolean setAction(){ //will I have to return a boolean for this method or a void?
    char[] plays = new char[]{'R', 'P', 'S'};
    Random chance = new Random(); //an object is a thing that allows you to get data
    action = plays(chance.nextInt(3)); //generates a number between 0 and 2
    //we do not need to define action as a char because we are already storing a char into a variable.
    return true;
  }
  /**returns the char representing the action*/
  public char getAction(){
    
    return action; 
  }
  
  /**return true if human player*/
  public boolean isHuman(){
    return human;
  }
  public static void main(String[] args){
    Player test1 = new Player(true, "Caesar");
    Player test2 = new Player(false, "Cato");
    // make the tests for the methods
  }
  
  System.out.println(player1.getName());
  player1.setName("Caesar");
  System.out.println(player1.getName());
  
  player1.setAction("R");
  System.out.println(player1.getAction());
  player1.setAction("S");
  System.out.println(player1.getAction());
  
  player1.setAction();
  System.out.println(player2.getAction());
  
  player1.incrementWins();
  player2.incrementWins();
  System.out.println(player1.getWins());
  
  
  
  
}