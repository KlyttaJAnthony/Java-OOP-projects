/** Player.java v2.0
  * @description Player class for Rock Paper Scissors Game
  * @version 2023-03-29, 2.0
  * @author A Klytta
  */

public class RPSPlayer extends Player{
  
  //attributes
  private char action;
  private char[] plays = {'R', 'P', 'S'};
  
  //methods
  //DO NOT COPY AND PASTE FROM THE PARENT CLASS, USE SUPER
  public RPSPlayer(boolean human, String name){
    super(human, name); //super calls the parent class 
  }
  public RPSPlayer(boolean human){
    super(human);
  }
  public RPSPlayer(){
    super(true); //super on its own references the parent constructor class which is the player constructor, this makes the default human
  }
  //since this is a child class, we inherit all the getters and setters from the parent class.
  public void dynamicPoints(){
    super.dynamicPoints(1);
  }
  public void dynamicPoints(int dynamic){
    dynamicPints();
  }
 public static void main(String[] args){
    RPSPlayer test = new RPSPlayer();
   test.setName("Sunny");
   System.out.println(test.getName() + " " +test.isAHuman());
  }
 
}