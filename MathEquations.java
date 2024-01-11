/**MathEquations.java
  *@description: math package
  *@author A Klytta
  *version 1.0, 2023-02-018
  */

import java.lang.Math;


public class MathEquations{
  
  
  public static void main (String[] args){
    
    public static double[] quadraticFormula(double a, double b, double c){
      
      double rootOne = (-b + Math.sqrt(math.pow(b,2) - 4*a*c)) / (2*a);
      double rootTwo = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
      
      //storing both possible answers +, - to these arrays. 
      double[] rootArray = new double [2];
      rootArray[0] = rootOne; //first root being stored here
      rootArray[1] = rootTwo; //second root being stored here
      
      return rootArray;
    }
    //formula takes in doubles a, b, and c and puts them in arrays
    public static double[] coefficientNumbers(){
      double a = 2.0;
      double b = 4.0;
      double c = 6.0;
      double [] coefficients = {a, b, c};
      return coefficients;
      
      
    }
    //prints the result the quadratic formula method
    public static void main(String [] args) {
      double [] coefficients = coeficientNumbers();
      double [] rootPositive = quadraticFormula(coefficients[0], coefficients[1], coefficients[2]);
      double [] rootNegative = quadraticFormula(coefficients[0], coefficients[1], coefficients[2]);
      
      System.out.println("Root positive is: " + rootPossitive[0] + " & " + rootPossitive[1]);
      System.out.println("Root positive is: " + rootNegative[0] + " & " + rootNegative[1]);
      
    }
    
    
    
    public static double areaSquare(double LengthSquare){
      double areaSquare = LengthSquare * LengthSquare;
      return areaSquare;
    }
    public static void main(String[] args){
      double LengthSquare = 6.0; //assignment variable
      double SQarea = MathEquations.squareArea(LengthSquare);
      System.out.println("Here is the area of the Square: " + SQarea);
      
    }
    //declaring the rectangle variables
    public static double areaRectangle(double LengthRectangle, double WidthRectangle){
      double RecArea = LengthRectangle * LengthWidth; //equations
      return RecArea;
    }
    
    public static void main(String[] args){
      double LengthRectangle = 8.0; //assignment variable
      double WidthRectangle = 9.0; //assignment variable
      double RecArea = MathEquations.areaRectangle(LengthRectangle, WidthRectangle);
      System.out.println("Here is the area of the Rectangle: " + RecArea)
    }
    
    public static double areaCircle(double Radius){
      double pi = Math.PI; //assignment variable to pi
      double CircArea = pi  * Math.pow(Radius, 2);
      return CircArea;
    }
    
    public static void main(String[] args){
      double Radius = 9.0;
      double CircArea = MathEquations.areaCircle(Radius);
      System.out.println("Here is the area of the Circle: " + CircArea);
    }
    
     public static double areaTriangle(double TriSide, double TriHeight, double TriBase){
      double T = (TriBase * TriHeight * TriSide) / 2.0;
      double TriArea = Math.sqrt(T * (T - TriSide) * (T - TriBase) * (T - TriHeight));
      return TriArea;
    }
    
    //side was in place for the required equation
    public static void main(String[] args){
      double TriBase = 8.0;
      double TriHeight = 10.0;
      double TriSide = 3.0;
      double TriArea = MathEquations.areaTriangle(TriBase, TriHeight, TriSide);
      System.out.println("Here is the area of the Triangle: " + TriArea);
    }
    
    public static double perimeterSquare(double SquareSide){
      double SquarePermiter = 4.0 * SQuareSide;
      return perimeterSquare;
    }
    
    public static void main(String[] args){
      double SquareSide = 7.0;
      double 
      
    }
    
    
    
  }
}