
//static methods
Class Calculator{
  public static void printSum(int a, int b){
    System.out.println("Sum = " + (a + b));
  }
}


public class Main{
  public static void main(String[] args){
    Calculator.printSum(5, 10); //by typing class.method notation for the main class, the variables of a will be 5, b will be 10
                                //thus the print method from the printSum class will be passed and created.
    printHello(); //we can also simply reference the method if it is within the main method
  }
  public static void printHello(){
    System.out.println("Hello");
  }
}


//instance methods
class Dog{
  public void bark(){ //creating a method
    System.out.println("Woof");
  }
}
public class Main{
  public static void main(String[] args){
    Dog rex = new Dog();
    rex.bark(); //accessing the method within the Rex instance
  }
}
