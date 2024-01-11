/** HangmanStartcreen.java
  * @description GUI content for Hangman start screen
  * @author A Klytta
  * @version 1.0, 2023-04-20
  */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HangmanHomescreen extends JPanel{

  // --- attributes ---
  private Color MysteryColor = new Color(152, 255, 152);
  private Gallows gallows;
  private JLabel results, WinsAndLosses, answer;
  private JButton play, end;
  
  
  private Font resultsFont = new Font("Comic Sans MS", Font.BOLD, 38),
               labelFont = new Font("Comic Sans MS", Font.BOLD, 20);
  
  
  private JPanel buttonsPanel, resultsPanel, gallowsPanel, winLossWordPanel;
  private boolean win;
  private int mistakes;
  private String rightWord;

  // --- methods ---
  public HangmanHomescreen(boolean win, int mistakes, String rightWord){ // created JPanel
    
    //if win = True, then they won
    this.win = win;
    //mistakes tell us which gallows to use
    this.mistakes = mistakes;
    //rightWord from the last game
    this.rightWord = rightWord;
    makeText();
    setBackground(mint);

    makeButtons();
    makePanels();


    add(gallowsPanel);
    add(resultsPanel);
    add(winLossWordPanel);
    add(buttonsPanel);

  }


  public void makeText(){

    String s = """
               The object of hangman is to fill out the secret seven-letter
               word before the stick figure is hung. You will select letters
               A through Z in any order you choose. If you guess a letter
               within the word, that letter will appear in the answer. If,
               however, you guess a letter not in the word, the stick figure
               gets closer to its doom.
               """;
    directions = new JTextArea(s);
    directions.setEditable(false);
    directions.setFont(directionFont);


    title = new JLabel("Hangman", SwingConstants.CENTER);
    title.setFont(titleFont);
  }
  
  public void makeText(){
    if (win)
      results = new JLabel("YOU WON!");
    else
      results = new JLabel("YOU LOST!");
    results.setFont(resultsFont);
    
    Strings s = "Wins: " + HangmanScore.getWins() + "; Losses: " + HangmanScore.getLosses();
  
    winsAndLosses = new JLabel(s);
    winsAndLosses.setFont(labelFont);
    
    answer = new JLabel("The answer was: " + rightWord);
    answer.setFont(labelFont);
  }

  public void makeButtons(){

    play = new JButton("Play");
    end = new JButton("End Game");
    play.setFont(labelFont);
    end.setFont(labelFont);

    //button listener
    ButtonListener listener = new ButtonListener();
    play.addActionListener(listener);
    end.addActionListener(listener);

  }


  public void makePanels(){
    // width of 1000 pixels fills frame
    buttonsPanel = new JPanel();

    buttonsPanel.setPreferredSize(new Dimension( Hangman.getFrameWidth() ,  Hangman.getFrameHeight() * 3 / 20
                                               ));

    buttonsPanel.add(play);
    buttonsPanel.add(end);
    buttonsPanel.setBackground(mysteryColor);


    resultsPanel = new JPanel();
    resultsPanel.setPreferredSize(new Dimension(
      Hangman.getFrameWidth(), Hangman.getFrameHeight() * 3 / 20 ));

    resultsPanel.setLayout(new BorderLayout());
    resultsPanel.add(title, BorderLayout.CENTER);
    resultsPanel.setBackground(mysteryColor);

    //gallowsImage = new Gallows();

    gallowsPanel = new JPanel();
    gallows = new Gallows();
    gallows.setImage(mistakes);
    gallowsPanel.setPreferredSize(new Dimension(Hangman.getFrameWidth()*1/10,  Hangman.getFrameHeight() * 25 / 100 ));
    gallowsPanel.setLayout(new BorderLayout());
    gallowsPanel.add(gallows, BorderLayout.CENTER);
    //gallowsPanel.setBackground(purply);


    winLossesPanel = new JPanel();
    winLossesPanel.setPreferredSize(new Dimension(Hangman.getFrameWidth() * 5/10, Hangman.getFrameHeight() * 5 / 20 ));
    winLossesPanel.setLayout(new BorderLayout(250, 10));
    winLossesPanel.add(directions, BorderLayout.CENTER, SwingConstants.CENTER);
    winLossesPanel.setBackground(mint);
  }


  private class ButtonListener implements ActionListener{

    /** Responses to ActionEvents in class */
    public void actionPerformed(ActionEvent event){

      Object o = event.getSource();
      JButton b = (JButton) o;

      if (b == end){
        System.exit(0);
      }else{
        Hangman.startGame();
      }

    }// end of actionPerformed method

  }//end of private subclass

}// end of class
