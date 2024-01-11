

public class NewNumbers extends MassiveNumber{

  double j = 0;


  public NewNumbers(){
    super(5, 10, 15, 20, 25);
  }
  public void printNumber(){
    System.out.println("First Number: " + x);
    System.out.println("Second Number: " + y);
    System.out.println("Third Number: " + z);
    System.out.println("Fourth Number: " + x1);
    System.out.println("Fifth Number: " + y1);
  }
  public void forLoop(){
    for(; x < y; x++){
      System.out.println(x);
      // j = x + y;
      // System.out.println(j);
    }
  }

  public static void main(String[] args){
    NewNumbers testNumbers = new NewNumbers();
    testNumbers.forLoop();
  }
}
