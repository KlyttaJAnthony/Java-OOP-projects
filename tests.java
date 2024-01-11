/**tests.java
  *@description: math package
  *@author A Klytta
  *version 1.0, 2023-02-018
  */



import java.lang.Math;
import java.util.Scanner;

public class QuadraticFormula{
  
  /** Prints the roots of a quadratic formula */
  public static void main(String[] args){
    
    
    // TEST 1:
    //-----------------------------------------------------------
    //tests coefficient inputs; results stored in amazingCoefficients
    double [] amaxingCoefficients = QuadraticFormula.coefficientInputs();
    
    // pass user inputs from coefficientInputs to quadraticFormula
    double[] results = QuadraticFormula.quadraticFormula(amazingCoefficients[0],
                                                         amazingCoefficients[1],
                                                         amazingCoefficients[2]);
    
    //display results
    QuadraticFormula.displayRoots(results); //note*takes in array
    
    // TEST 2: 1, 2, 1
    //------------------------------------------------------------
    System.out.println("Output for case 2: a=1, b=2, c=3:")
    double[] results2 = QuadraticFormula.quadraticFormula(1.0, 2.0, 1.0);
    //display results
    QuadraticFormula.displayRoots(resultsTwo);
  }
  
  /** Returns an array of two roots using coefficients provided */
  public static double[] quadraticFormula(double a, double b, double c){
    //commands for quadratic formula 
    double rootOne = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
    double rootTwo = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
    
    //double array of two entries
    double[] rootArray = new double[2]; 
    rootArray[0]=rootOne;
    rootArray[1]=rootTwo;
    
    return rootArray;
  }
  
  /** Prompts user to enter coefficients */
  public static double[] coefficientInputs(){
    
    Scanner input = new Scanner(System.in); 
    
    System.out.print("Enter the value of a: ");
    int a = input.nextInt(); //input with int
    System.out.print("Enter the value of b: ");
    int b = input.nextInt();
    System.out.print("Enter the value of c: ");
    int c = input.nextInt();
    
    double[] coefficients = new double[3];
    coefficients[0] = (double) a;
    coefficients[1] = (double) b;
    coefficients[2] = (double) c;
    
    return coefficients;
  }
  
  public static void displayRoots(double[] outputArray){
    
    System.out.println("Your zeroes are " + outputArray[0] + ", " + outputArray[1]);
    
  public static double [] areaOfSquare( /"
? ,,nv bmghjk;/P{}
V \")
    
  
}





  
  



  
    
