

public class NumberInheritance extends Number{
  private int newNumber;

  public NumberInheritance(){
    super(1, 3, 5);
  }
  public void printNumber(){
    System.out.println("First Number: " + firstNumber);
    System.out.println("Second Number: " + secondNumber);
    System.out.println("Third Number: " + thirdNumber);
  }
  public void fNumberLoop(){
    int[] numberArray = new int[11];//an array that houses 11 values: 0-10
    int index = 0; //initializes the index at 0
    for (; firstNumber <= 10; firstNumber++){//this is saying for every number in the firstNumber variable below 10, to add.
      numberArray[index] = firstNumber; //whenever a number is then added, put it into the index array
      index++;

      System.out.println(firstNumber);
      if (firstNumber < 10){
        System.out.println("This number is below ten");
      }else{
        System.out.println("This number is now ten");
      }
    }
    for (int i = 0; i < numberArray.length; i++){
      System.out.println("Number at index " + i + "; " + numberArray[i]);
    }
  }
  public void sNumberLoop(){
    int[] numberArray2 = new int[11];
    int index2 = 0;
    for(; secondNumber < 18; secondNumber++){
      numberArray2[index2] = secondNumber;
      secondNumber = secondNumber + 5;
      index2++;

      System.out.println(secondNumber);
      if(secondNumber < 3){
        System.out.println("This number is below 20");
      }else{
        System.out.println("Number is now 20");
      }
    }
    for (int y = 0; y < numberArray2.length; y++){
      System.out.println("Number is at index " + y + ";" + numberArray2[y]);
    }
  }
  public void tNumberLoop(){
    int[] numberArray3 = new int[11];
    int index3 = 0;
    for(; thirdNumber < 25; thirdNumber++){
      numberArray3[index3] = thirdNumber;
      thirdNumber = thirdNumber + 2;
      index3++;

      System.out.println(thirdNumber);
      if(thirdNumber < 5){
        System.out.println("This number is below 25");
      }else{
        System.out.println("This number is now 25");
      }
    }
    for (int z = 0; z < numberArray3.length; z++){
      System.out.println("Number is at index " + z + ":" + numberArray3[z]);
    }
  }
  public void numberAdd(){
    newNumber = firstNumber + secondNumber + thirdNumber;
    System.out.println(newNumber);
  }
  public static void main(String[] args){
    NumberInheritance numberInheritance = new NumberInheritance();
    numberInheritance.fNumberLoop();
    numberInheritance.sNumberLoop();
    numberInheritance.tNumberLoop();
    numberInheritance.numberAdd();
    numberInheritance.printNumber();
  }
}
