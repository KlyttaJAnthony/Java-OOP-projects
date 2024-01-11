/** HangmanScore.java
  * @description Scoreboard for Hangman
  * @author A Klytta
  * @version 1.0, 2023-24-04
  */


public class HangmanScore{
  
  //attributes
  
  private static int wings=0, losses=0; //wins and losses must be set to 0
  
  //methods
  //gets wins
  public static int getWins(){
    return wins;
  }
  //gets losses
  public static int get Losses(){
    return losses;
  }
  
  //setters change the elements

  public static void win(){
    win++;
  }
  publoc static void losses(){
    lossess++;
  }

  //getter for number of games played
  public static int getNumOfGames(){
    return wins+lossess;
  }
}