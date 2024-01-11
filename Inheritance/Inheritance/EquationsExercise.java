

public class EquationsExercise{
  protected double x;
  protected double y;
  protected double z;
  protected double x1;
  protected double y1;

  protected double[] overArray;
  protected double overIndex = 0;

  public EquationsExercise(double x, double y, double z, double x1, double y1, double[] overArray){
    this.x = x;
    this.y = y;
    this.z = z;
    this.x1 = x1;
    this.y1 = y1;
    this.overArray = overArray;
  }
  public void overNumber(){
    for(; y <= 50; y++){
      overArray[(int)overIndex] = y1; //have to type case this because y1 is declared a double
      overIndex++;
      System.out.println("Here this is!" + y1);
    }
  }
  public void yesNumber(){
    x = 25;
    if (x <= 25){
      x++;
      System.out.println("This is now: " + x);
    }else{
      System.out.println("Not anymore.");
    }
  }
}
