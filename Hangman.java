/** Hangman.java
  * @description Driver for Hangman Game
  * @author S Jamshidi
  * @version 1.0, 2023-04-03
  */

import java.awt.*;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Hangman{

  private static JFrame frame;
  private static int frameWidth, frameHeight;

  /** Main method to drive the program */
  public static void main(String[] args){

    frame = new JFrame("Hangman");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    frameWidth = (int) screenSize.getWidth() - 100;
    frameHeight = (int) screenSize.getHeight() - 100;

    frame.setBounds(50, 50, frameWidth, frameHeight);

    frame.getContentPane().add(new HangmanStartscreen());
    frame.setVisible(true);

  }

  /** refreshes content of frame  */
  public static void refresh(){
    frame.setVisible(true);
  }

  /** refreshes content of frame  */
  public static int getFrameWidth(){
    return frameWidth;
  }

  /** refreshes content of frame  */
  public static int getFrameHeight(){
    return frameHeight;
  }

  public static void startGame(){
    frame.getContentPane().removeAll();
    frame.getContentPane().add(new HangmanMainPanel());
    frame.setVisible(true);
  }

  public static void endGame(boolean win, int mistakes, String rightWord){
    frame.getContentPane().removeAll();
    frame.getContentPane().add(new HangmanStartscreen(win, mistakes, rightWord));
    frame.setVisible(true);
  }

}
