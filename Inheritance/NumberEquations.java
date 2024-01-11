

public class NumberEquations extends MassiveNumber{


  public NumberEquations(){
    super(5, 10, 15, 20, 25);
  }
  public void printNumber(){
    System.out.println("First Number: " + x);
    System.out.println("Second Number: " + y);
    System.out.println("Third Number: " + z);
    System.out.println("Fourth Number: " + x1);
    System.out.println("Fifth Number: " + y1);
  }
  public static void main(String[] args){
    NumberEquations numberEquations = new NumberEquations();
    numberEquations.printNumber();
  }
}
