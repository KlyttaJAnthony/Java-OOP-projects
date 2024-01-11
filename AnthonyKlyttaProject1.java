/** AnthonyKlyttaProject1.java
  * @statically packaged math program
  * @author A Klytta
  * @version 2.0 2023-02-14
*/

import java.lang.Math;
import java.util.Scanner;

public class MathOperations{
  
  public static void main(String[] args){
    
    
  }
  
  public static double[] quadraticFormula(double a, double b, double c){
    
    double rootOne = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
    double rootTwo = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
    
    double [] rootArray = new double[2];
    rootArray[0]=rootOne;
    rootArray[1]=rootTwo;
    
    return rootArray;
  }
  public static double [] coefficientInputs(){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value for a: ");
    int a = input.nextInt();
    System.out.print("Enter the value for b: ");
    int b = input.nextInt();
    System.out.print("Enter the value for c: ");
    int c = input.nextInt();
    
    double[] coefficient = new double[3];
    coefficients[0] = (double) a;
    coefficients[1] = (double) b;
    coefficients[2] = (double) c;
    return coefficients;
    
  }
  
}