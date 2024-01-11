/**
  *This is the first program from the book by Buchwhateverhisname is
  *@description this is a file that goes over keywords and methods.
  *@version 1 2023-05-15
  *@author Anthony Klytta
  */

  public class SwitchStatement{

    public static void main(String[] args){

      // int value = 1;
      // if (value ==1){
      //   System.out.println("Value was 1");
      // } else if (value == 2){
      //   System.out.println("Value was 2");
      // } else {
      //   System.out.println("Was not 1 or 2");
      // }


      // int switchvalue = 3;
      // int switchvalue = 2;
      // int swtichvalue = 1;
      // switch (switchvalue) {
      //   case 1: //this will be the case in which you want to test the switch statemetn
      //       System.out.println("Value was 1");
      //       break;  //will execture the print and go to line 27.
      //   case 2:
      //       System.out.println("Value was 2");
      //       break; //breaks are important to make sure that the cases are grouped together
      //   case 3: case 4: case 5: //testing for multiple cases, for instance if the swtich value was actually 3-5
      //       System.out.println("Was 3, 4, or 5");
      //       System.out.println("Actually it was a + " switchvalue);
      //       break;
      //   default:
      //       System.out.println("Was not 1, 2, 3, 4, or a 5");
      //       break;
      // }

      int newValue = 5;
      switch (newValue) {
        case 1:
          for (newValue = 1; newValue <= 10; newValue++){
            System.out.println(newValue);
          }
          break;
        case 2:
          for (newValue = 1; newValue <= 20; newValue++){
            System.out.println(newValue);
          }
          break;
        case 3:
          System.out.print(newValue);
          break;
      }
    }
  }
