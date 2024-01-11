/**SampleGui.java
  *@description sample gui, to play around with and experiment
  *@version 1.0 2023-03-31
  *@author A J. Klytta
*/
// the * gives libraries access to all methods within the all the classes, both parent and inherited
import java.awt.*; // for gui element
import java.swing.JFrame.*; // for gui element
// import java.swing.JFrame; belongs to the swing library
import java.awt.event.*;  // makes gui interactive


public class SampleGui{
  //attributes
  private JFrame frame;
  private int width, height;
  private JPanel background;
  
  
  //methods
  public SamepleGui(int width, int height, String title){
    this.width = width;
    this.height = height;
    frame new JFrame(Title);
    setFrameToVisible(); //you can call methods into other methods, often used to make code easier to read.
  }
   public SamepleGui(){
    this.width = 600;
    this.height = 800;
    frame = new JFrame("No title provided");
     setFrameToVisible();
  }
   public SamepleGui(){
    this.width = 600;
    this.height = 800;
    frame = new JFrame(title);
     setFrameToVisible();
  }
  
  /**make frame visible */
  
  public void setFrameToVisible(){
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this will exit on termination 
    frame.setSize(width, height); //passing the width and height attributes
    frame.setVisible(true);
  }
  
  
  //ref
  
  /**makes the background */
  
  public void setBackground(){
    background = new JPanel(); //
    background.setBackground(new Color(232, 232, 232)); //RGB: pink 255, 180, 180
    frame.add(background);
    
    
  }
  
  
  
  //main method for testing
  public static void main(String[] args){
    SamepleGui test1 = new SampleGui(800, 1000, "Big Frame");
    SamepleGui test2 = new SampleGui("Default size frame");
    
  }
  
  //can you set the position of the window to the center of it
  
  
  
  
  //Main method
 // public static void main(String[] args){
    
   // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    //this passes an integer, but also retrieving something from the JFrame
   // frame.setSize(600, 800); //setting pixel size of the window
    //frame.getContantPane().add(new RightWordsPanel()); //adding new panel
    //frame.pack(); //packs the frame for the content.
    //frame.setVisible(true); //setter for showing what is on the screen
  }
}