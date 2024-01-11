/** TestsOfArraysAndArrayLists.java
  * @description Some examples with Arrays and ArrayLists
  * @version 1.0, 2023-03-27
  * @author S Jamshidi
*/

public class TestsOfArraysAndArrayLists{

  // --- attributes ---
  private String[] majors;
  private int numOfMajors;

  // --- methods ---
  public TestsOfArraysAndArrayLists(){
    majors = new String[10]; // maximum number of majors
    numOfMajors = 0;
  }

  /** prints the contents of major */
  public String getMajors(){

    String s = "";
    //for (int i=0; i<majors.length; i++){
    for (int i=0; i<numOfMajors; i++){
      if (i == numOfMajors-1){
        s += majors[i];
      }else{
        s += majors[i] + ", ";
      }

    }
    s += "\n";
    return s;
  }

  /** returns true if major is added to majors array */
  public boolean addMajor(String major){
    if (numOfMajors < majors.length){
      majors[numOfMajors] = major;
      numOfMajors++;
      return true;
    }else{
      return false;
    }
  }

  /** returns true if major is removed */
  public boolean removeMajor(String major){

    boolean success = false;
    int location = -1;

    for (int i=0; i<numOfMajors; i++){
      if ( majors[i].equals(major) ){
        majors[i] = null;
        success = true;
        numOfMajors--;
        location = i;
        break;
      }
    }

    if (success){
      for (int j = location; j<numOfMajors; j++){
        majors[j] = majors[j+1];
      }
      majors[numOfMajors] = null;
    }

    return success;
  }


  /** main method for testing */
  public static void main(String[] args) {
    TestsOfArraysAndArrayLists test = new TestsOfArraysAndArrayLists();
    System.out.println(test.getMajors());
    System.out.println(test.addMajor("CS"));
    System.out.println(test.addMajor("Math"));
    System.out.println(test.addMajor("Chem"));
    System.out.println(test.addMajor("Econ"));
    System.out.println(test.addMajor("History"));
    System.out.println(test.addMajor("Robotics"));
    System.out.println(test.getMajors());
    System.out.println(test.removeMajor("Chem"));
    System.out.println(test.getMajors());
  }


}
