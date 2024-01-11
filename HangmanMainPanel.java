/** HangmanMainPanel.java
  * @description GUI content for Hangman
  * @author S Jamshidi
  * @version 1.0, 2023-04-03
  */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HangmanMainPanel extends JPanel{
  // --- attributes ---
  private Color purply;
  private JLabel word, picture, directions;
  private JButton[] letterButtons;
  private Gallows gallows;
  private Font font;
  private JPanel buttonsPanel, titlePanel, gallowsPanel, answerPanel;
  private String answer, display;
  private char[] hiddenAnswer;
  private int mistakes = 1;

  // --- methods ---
  public HangmanMainPanel(){ // created JPanel

    makeColorsAndFonts();

    makeLabels();
    setBackground(purply);

    makePanels();
    makeButtonsAndAdd();

    add(titlePanel);
    add(gallowsPanel);
    add(answerPanel);
    add(buttonsPanel);
  }

  public void makeColorsAndFonts(){
    purply = new Color(200, 100, 255);
    font = new Font("Comic Sans MS", Font.BOLD, 38);
  }

  public void makeLabels(){
    directions = new JLabel("Guess a Letter", SwingConstants.CENTER);
    directions.setFont(font);
    directions.setForeground(new Color(255, 180, 180));
    word = new JLabel("", SwingConstants.CENTER);
    updateDisplay();
    word.setFont(font);
  }

  public void makeButtonsAndAdd(){
    //JButton buttonA = new JButton("A");

    //make button array
    letterButtons = new JButton[26];

    //button listener
    ButtonListener listener = new ButtonListener();

    //make actual buttons stored in the array
    //add actionlistener to those buttons
    for(int i=0; i<26; i++){
      letterButtons[i] = new JButton( (char) (65 + i) + "" ); // how to pass as a string??
      letterButtons[i].setFont(font);
      buttonsPanel.add(letterButtons[i]);
      letterButtons[i].addActionListener(listener);
    }

  }

  /** initialized the display with dashes */
  public void updateDisplay(){

    answer = HangmanWord.getWord();
    hiddenAnswer = new char[answer.length()];

    // fill hiddenArray with dashes
    for (int i = 0; i<answer.length(); i++){
      hiddenAnswer[i] = '-';
    }

    // convert that to a string
    display = "";
    for (char entry : hiddenAnswer){
      display += entry;
    }

    // add the string to word
    word.setText(display);
  }

  public boolean updateDisplay(char guessedLetter){
    boolean aChangeHappened = false;

    for (int i=0; i<answer.length(); i++){
        if (answer.charAt(i) == guessedLetter){
          hiddenAnswer[i] = guessedLetter;
          aChangeHappened = true;
        }
    }
    if (!aChangeHappened){
      return false;
    }

    // convert that to a string
    display = "";
    for (char entry : hiddenAnswer){
      display += entry;
    }

    // add the string to word
    word.setText(display);

    return true;

  }

  public void makePanels(){
    // width of 1000 pixels fills frame
    buttonsPanel = new JPanel();

    buttonsPanel.setPreferredSize(new Dimension( Hangman.getFrameWidth() ,  Hangman.getFrameHeight() * 3 / 10
                                               ));
    System.out.println(Hangman.getFrameWidth());
    System.out.println(Hangman.getFrameHeight() * 3 / 10);

    buttonsPanel.setLayout(new GridLayout(3,9));
    buttonsPanel.setBackground(purply);


    titlePanel = new JPanel();
    titlePanel.setPreferredSize(new Dimension(
      Hangman.getFrameWidth(), Hangman.getFrameHeight() * 3 / 20 ));

    titlePanel.setLayout(new BorderLayout());
    titlePanel.add(directions, BorderLayout.CENTER);
    titlePanel.setBackground(purply);

    //gallowsImage = new Gallows();

    gallowsPanel = new JPanel();
    gallows = new Gallows();
    gallowsPanel.setPreferredSize(new Dimension(Hangman.getFrameWidth()*1/10,  Hangman.getFrameHeight() * 25 / 100 ));
    gallowsPanel.setLayout(new BorderLayout());
    gallowsPanel.add(gallows, BorderLayout.CENTER);
    //gallowsPanel.setBackground(purply);


    answerPanel = new JPanel();
    answerPanel.setPreferredSize(new Dimension(Hangman.getFrameWidth(), Hangman.getFrameHeight() * 3 / 20 ));
    answerPanel.setLayout(new BorderLayout(250, 10));
    answerPanel.add(word, BorderLayout.CENTER, SwingConstants.CENTER);
    answerPanel.setBackground(purply);
  }

  public boolean solved(){
    for (char entry : hiddenAnswer){
      if (entry == '-')
        return false;
    }
    return true;
  }


  private class ButtonListener implements ActionListener{

    /** Responses to ActionEvents in class */
    public void actionPerformed(ActionEvent event){

      Object o = event.getSource();
      JButton b = (JButton) o;
      //disable the button after 1 use
      b.setEnabled(false);

      boolean succeed = updateDisplay(b.getLabel().charAt(0));

      // update picture?
      if (!succeed){
        mistakes++;
        //update image
        gallows.setImage(mistakes);
        gallows.validate();
        gallows.repaint();
        //refresh frame
        Hangman.refresh();
      }
      if (mistakes == 8)
        Hangman.endGame();

      if (solved())
        Hangman.endGame();

    }// end of actionPerformed method

  }//end of private subclass

}// end of class
