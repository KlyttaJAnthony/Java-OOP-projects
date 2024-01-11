/** Player.java v2.0
  * @description Player class for Rock Paper Scissors Game
  * @version 2023-03-29, 2.0
  * @author A Klytta
  */

//protected methods can only be called by parent/child classes
import java.util.Random;

public class Player{
  
  // attributes 
  protected String name; //protected means that the attribute can be inherited by child classes
  private boolean human; // relevant for inheritance
  private int points; //wins to points

  // methods
  /** Constructor */
  public Player(boolean human, String name){
    this.human = human;
    this.name = name;
    points = 0;
  }
  /** Constructor -- no name */
  public Player(boolean human){
    this.human = human;
    this.name = "";
  }
  /** Constructor -- default of human and no name */
  public Player(){
    human = false; //by default, the player constructor should have an assumed computer deignation
    name = "";
    points = 0;
  }
  /** getter for name attribute*/
  public String getName(){
    return name;
  }
  /** setter for name attribute*/
  public void setName(String name){
    this.name = name;
  }
  /** getter for the number of points */
  public int getPoints(){
    return points;
  }
  /** setter for wins*/ //DESPITE THE FACT THAT THERE ARE NO SET NAMINGS, THIS IS STILL A SETTER
  public void dynamicPoints(int dynamic){
    points += dynamic;
  }
  /** Returns true if human player */
  public boolean isAHuman(){
    return human;
  }
  
  public static void main(String[] args){
    //add testing later
  }
  
  
  
}