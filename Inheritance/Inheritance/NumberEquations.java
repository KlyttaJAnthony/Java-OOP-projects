//experimenting with some packages:


public class NumberEquations extends EquationsExercise{

  private double[] numberArray;
  private int index = 0;

  private double[] numberArray2;
  private int index2 = 0;

  private double[] numberArray3;
  private int index3 = 0;


  public NumberEquations(){
    super(5, 10, 15, 20, 10, new double[100]);
    numberArray = new double[10]; //initializing the numberArray with a size of 10
    numberArray2 = new double[50];
    numberArray3 = new double [100];
  }
  public void printNumber(){
    System.out.println("First Number: " + x);
    System.out.println("Second Number: " + y);
    System.out.println("Third Number: " + z);
    System.out.println("Fourth Number: " + x1);
    System.out.println("Fifth Number: " + y1);
  }
  public double pythagTheorem(){
    double hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    System.out.println("The hypotenuse is: " + hypotenuse);
    return hypotenuse;
  }
  public double logarithmTheorem(){
    double logarithm = Math.log(z) / Math.log(y1);
    System.out.println("The log equation: " + logarithm);
    return logarithm;
  }
  public double quadraticFormula(){
    double quadraticFormula =
  }
  // public double loopStuff(){
  //   for(; x <= 10; x++){
  //     numberArray[index] = x;
  //     index++;
  //     System.out.println(x);
  //   }
  //   return x;
  // }
  // public double loopStuff2(){
  //   for(; y <= 30; y++){
  //     numberArray2[index2] = y;
  //     index2++;
  //     System.out.println(y);
  //   }
  //   return y;
  // }
  // public double loopStuff3(){
  //   for(; z <= 60; z++){
  //     numberArray3[index3] = z;
  //     index3++;
  //     System.out.println(z);
  //   }
  //   return z;
  // }
  // //overriding a method
  // public void overNumber(){
  //   for(; y1 <= 15; y1++){
  //     overArray[(int)overIndex] = y1; //have to declare this as an int because it was declared a double
  //     overIndex++;
  //     System.out.println("No here it is: " + y1);
  //   }
  // }
  // public void switchCase(){
  //   for (x1 = 1; x1 <= 40; x1++){
  //     switch ((int) x1){
  //       case 1:
  //       System.out.println("Here is x1: " + x1);
  //       break;
  //       case 2:
  //         if (x1 >= 20){
  //           System.out.println("Here is x1: " + x1);
  //         }
  //       break;
  //       default:
  //       System.out.println("default case: " + x1);
  //       break;
  //     }
  //   }
  // }
  // public void yesNumber(){
  //   x = 10;
  //   if (x <= 15){
  //     x++;
  //     System.out.println("Here is x: " + x);
  //   }else{
  //     System.out.println("There is no x");
  //   }
  // }
  public static void main(String[] args){
    NumberEquations numberEquations = new NumberEquations();
    numberEquations.printNumber();
    numberEquations.pythagTheorem();
    numberEquations.logarithmTheorem();
    // numberEquations.loopStuff();
    // numberEquations.loopStuff2();
    // numberEquations.loopStuff3();
    // numberEquations.overNumber();
    // System.out.println("y1: " + numberEquations.y1);
    // numberEquations.switchCase();
    // numberEquations.yesNumber(); //calling the methods from the parent class will print the method.
  }
}
