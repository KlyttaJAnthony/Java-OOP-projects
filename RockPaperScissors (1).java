/** RockPaperScissors.java
  * @description A driver for terminal game of Rock Paper Scissors
  * @version 2023-02-27, 1.0
  * @author S Jamshidi
*/

import java.util.Scanner;

public class RockPaperScissors{
  
  //attributes 
  private Player playerOne, playerTwo; 
  private int rounds; 
  private Scanner input = new Scanner(System.in); //scanner
  
  //methods 
  /** Constructor for class */
  public RockPaperScissors(){
    
    printWelcome();
    
    do{
    setAction(playerOne);
    setAction(playerTwo);
    System.out.println(getWinner().getName() + " is the winner");
    printSummary(); // scores & rounds played
    }while(playAgain()); // play again option
    
  }
  
  /** Prints the rules of the game & initializes player objects */
  public void printWelcome(){
    System.out.println("Welcome to Rock Paper Scissors!");
    System.out.println("Paper beats Rock");
    System.out.println("Rock beats Scissors");
    System.out.println("Scissors beats Paper");
    System.out.println("Choose your play and beat your opponent!");
    
    // setting number of human players
    int numOfPlayers;
    do{
    System.out.println("How many players for this game (Enter 1 or 2):");
    numOfPlayers = input.nextInt();
    input.nextLine(); // grab stray "enter" character
    }while(numOfPlayers > 2 && numOfPlayers < 1);
      
    //initializing players
    if (numOfPlayers == 1){ 
      System.out.println("What's your name?");
      playerOne = new Player(true, input.nextLine()); //creates human player 
      playerTwo = new Player(false, "Steve The Computer");
    }else{
      System.out.println("What's Player 1's name?");
      playerOne = new Player(true, input.nextLine()); //creates human player 
      System.out.println("What's Player 2's name?");
      playerTwo = new Player(true, input.nextLine()); //creates human player
    }
    
    System.out.println("Great! Let's play!");
  }
  
  /** sets the action of a player */
  public void setAction(Player currentPlayer){
  
    System.out.println("It is " + currentPlayer.getName() + "'s turn.");
    if (currentPlayer.isAHuman()){ // if a human
      
      boolean result; // Flag that represents the validity of their response 
      
      // guaranteed to run commands once; only repeats if result is false
      do{
        System.out.print("Enter play (R, P, or S): ");
        result = currentPlayer.setAction(input.nextLine()); 
      }while(!result); // checking response 
      
      
    }else{ // if a computer 
      System.out.print(currentPlayer.getName() + " is determining play");
      currentPlayer.setAction();
    } 
  }
  
  /** Gets the winner between two players */
  public Player getWinner(){
    
    char actionOne = playerOne.getAction();
    char actionTwo = playerTwo.getAction();
    
    // We use the ASCII codes for characters
      // R - 82
      // P - 80
      // S - 83
    // R < P , P < S, S < R
    // difference R,P = +-2, 
    // difference P,S = +-3,
    // difference S,R = +-1,
    // tie: difference = 0
    
    switch(actionOne - actionTwo){
      case 0: // tied!!
        return null; //no winner
        
      case -1: // playerOne:R,  playerTwo:S, Winner:playerOne
      case -2: // playerOne:P,  playerTwo:R, Winner:playerOne
      case 3:  // playerOne:S,  playerTwo:P, Winner:playerOne
        playerOne.incrementWins();
        return playerOne;
        
      case 1:  // playerOne:S,  playerTwo:R, Winner:playerTwo
      case 2:  // playerOne:R,  playerTwo:P, Winner:playerTwo
      case -3: // playerOne:P,  playerTwo:S, Winner:playerTwo
        playerTwo.incrementWins();
        return playerTwo;
      default:
        return null;
    }
     
  }
  
  /** Prompts user to see if they want to play again */
  public boolean playAgain(){
    System.out.println("Would you like to play again? (Enter Y or N)");
    String answer;
    char yesOrNo;
    do{
      answer = input.nextLine();
      yesOrNo = answer.toUpperCase().charAt(0); 
    }while(yesOrNo != 'N' && yesOrNo != 'Y');
    
    switch(yesOrNo){
      case 'N':
        return false;
      case 'Y':
        return true;
      default:
        return false;
    }
      
  }
  
  public void printSummary(){
    rounds++;
    System.out.println("You have played " + rounds + " rounds");
    System.out.println(playerOne.getName() + " has a score of " + playerOne.getWins());
    System.out.println(playerTwo.getName() + " has a score of " + playerTwo.getWins());
  }
  
  //main method -- to run 
  public static void main(String[] args){
    RockPaperScissors test = new RockPaperScissors();
  }
}