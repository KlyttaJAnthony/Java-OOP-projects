/** QuadraticFormula.java
  * @description Computes the roots of a quadratic
  * @author A Klytta
  * @version 2.0 2023-02-06
*/

import java.lang.Math;
import java.util.Scanner; // for inputs

public class QuadraticFormula{
  
  /** Prints the roots of a quadratic formula */
  public static void main(String[] args){
    
    Scanner input; //declaration
    input = new Scanner(System.in); //assignment
    //Scanner takes an input from system
    
    System.out.print("Enter the value of a: ");
    int a = input.nextInt(); //input with int
    System.out.print("Enter the value of b: ");
    int b = input.nextInt();
    System.out.print("Enter the value of c: ");
    int c = input.nextInt();
    
    double rootOne = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
    // b**2 is not what we want
    // NOTE: inputs for pow() and sqrt() involve doubles. Is it ok to input an int??
    double rootTwo = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
    
    System.out.println("Your zeroes are " + rootOne + ", " +rootTwo);
    
    // To Do ...
    
  }
  //since we are doing quadformula, variables should be floats.
  public static double[] quadraticFormula(double a, double b, double c){
    //commands for quad formula
    double rootOne = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a); 
    double rootTwo = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
    
    //creating an array to put these doubles in
    //the starting value of this array is 0.0
    double[] rootArray = new double[2]; 
    rootArray[0]=rootOne;
    rootArray[1]=rootTwo;
    
    return rootArray;
  
  }
  
  public static double[] coefficientInputs(){
    Scanner input = new Scanner(System.in); //assignment
    //Scanner takes an input from system
    
    System.out.print("Enter the value of a: ");
    int a = input.nextInt(); //input with int
    System.out.print("Enter the value of b: ");
    int b = input.nextInt();
    System.out.print("Enter the value of c: ");
    int c = input.nextInt();
    
    double[]=coefficients = new double[3];
    coefficients[0] = (double) a; //casting ints as doubles
    coefficients[1] = (double) b;
    coefficients[2] = (double) c;
    

    return coefficients;
    
  }
  
}