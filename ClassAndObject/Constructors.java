/**
  *This is the first program from the book by Ray Horstman.
  *@version 1 2023-05-15
  *@author Anthony Klytta
  */



  public class Constructors{
    int x;
    int y;
    public Constructors(int x, int y){
      this.x = 10;
      this.y = 25;
    }
    public int getX(){
      int multipliedValue = x;
      for (int i = 0; i < 5; i++){
        multipliedValue *= 100;
        System.out.println("new result: " + multipliedValue);
      }
      return multipliedValue;
    }
    public int getY(){
      return y;
    }
    public static void main(String[] args){
      Constructors numbers = new Constructors(10, 56); //so this is initializes int x and int y with 10 and 56
                                                      //number 1 thing with constructors is that they need to be in order of itself
      int result = numbers.getX();
      System.out.println("Final result: " + result);
      System.out.println(numbers.getY());
    }
  }
