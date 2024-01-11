
import java.util.Random;
import java.util.Scanner;

public class ArraysProject{
    
   protected int[] xArray;
   protected int[] yArray;
   protected int x;
   protected int y;
   protected static int randomNumber;
   protected String[] stringArray;

    public ArraysProject(int x, int y){
        this.x = x;
        this.y = y;
        xArray = new int[50]; //*IMPORTANT: arrays in java can only hold a fixed number of elements. ArrayLists are dynamic */
        yArray = new int[50];
        stringArray = new String[50];
    }
    public void randomObject(){
        Random random = new Random();
        randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
    }
    public static int getRandomNumber(){ //getter methods MUST have getter variables
        return randomNumber;
    }
    public int[] getXArray(){
        return xArray;
    }
    public int[] getYArray(){
        return yArray;
    }
    public String[] getStringArray(){
        return stringArray;
    }
    public static void main(String[] args){
        ArraysProject aProject = new ArraysProject(0, 0);
        aProject.randomObject();
    }
}