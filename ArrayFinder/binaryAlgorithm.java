
/**
 * TO DO LIST FOR NEXT TIME:
 * 1) FILL THE LISTS
 * 2) THEN RESEARCH BINARY SEARCH ALGORITHMS
 */

import java.util.Arrays;

public class binaryAlgorithm extends ArraysProject{
    int xBinary[] = getXArray();
    int yBinary[] = getYArray();
    String stringBinary[] = getStringArray(); //rule of thumb: when referencing getter methods in variables, MUST USE PARENTHESIS

    public binaryAlgorithm(){
        super(0, 0);
    }
    public void xBinaryAppender(){
        // xBinary[0] = 1;
        // System.out.println(Arrays.toString(xBinary));

        for (int x = 0; x < xBinary.length; x++){ //loop the length of the array with the variable i to input 1 added to another in each index
            xBinary[x] = x + 1;
        }
        System.out.println(Arrays.toString(xBinary));
    }
    /**another thing to note with these appender methods is that if the parent class's x and y arrays length changes from 100 to 50
     * the console will only output what has changed.
     * for instance if xArray goes from xArray = new int[100]; it will display 100 elements
     * but if it changes to yArray = new int[50]; only 50 elements will be displayed
     *  */
    public void yBinaryAppender(){
        for (int y = 0; y < yBinary.length; y++){
            yBinary[y] = y + 1;
        }
        System.out.println(Arrays.toString(yBinary));
    }
    public void StringArrayAppender(){
    }
    public void StringArrayFinder(){
    }
    public void xFinder(){
    }
    public void yFinder(){
    }
    public static void main(String[] args){
        binaryAlgorithm arrayFinder = new binaryAlgorithm();
        arrayFinder.xBinaryAppender();
        arrayFinder.yBinaryAppender();
    }
}