/** TestFrame.java
  * @description Driver for Testing panels
  * @author S Jamshidi
  * @version 1.0, 2023-04-16
  */

import java.awt.*;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TestFrame{

  private static JFrame frame;
  private static int frameWidth, frameHeight;

  /** Main method to drive the program */
  public static void main(String[] args){

    frame = new JFrame("Gallows");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    frameWidth = 625;
    frameHeight = 700;
    frame.setBounds(50, 50, frameWidth, frameHeight);

    Gallows gTest = new Gallows();
    frame.getContentPane().add(gTest);
    frame.setVisible(true);

    gTest.setImage(2); // won't  be visible until I resize!


  }



}
