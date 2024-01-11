/**
  *This is the first program from the book by Buchwhateverhisname is
  *@description this is a file that goes over keywords and methods.
  *@version 1 2023-05-15
  *@author Anthony Klytta
  */

  public class ControlFlow{

    public static method void main(String[] args){

      // int value = 1;
      // if (value ==1){
      //   System.out.println("Value was 1");
      // } else if (value == 2){
      //   System.out.println("Value was 2");
      // } else {
      //   System.out.println("Was not 1 or 2");
      // }

      int switchvalue = 1;
      switch (switchvalue) {
        case 1: //this will be the case in which you want to test the switch statemetn
            System.out.println("Value was 1");
            break;  //will execture the print and go to line 27.
        case 2:
            System.out.println("Value was 2");
            break;
        default:
            System.out.println("Was not 1 or 2");
            break;
      }




    }
  }
