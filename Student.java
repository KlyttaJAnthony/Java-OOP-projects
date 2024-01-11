/** Student.java
  * @description An OOP program that describes students
  * @version 2023-03-27, 1.0
  * @author A Klytta
*/

//attributes need setters and getters depending on a few things
//for example if there are things set within the attribute, it does not need a setter or getter
//Final modifier: only the variable becomes final. 


public class Student{
  public static final String School = "Lake Forest College"; //added this cause I wanted a final
  public long StudentID; //I don't feel that this should be final. Only because the program could possibly take new objects
  public int TotalStudents;
  public int ExpectedGradYear;
  public String FirstName;
  public String PreferredFirstName;
  public String LastName;
  public String[] Majors;
  public String[] Minors;
  public int numOfMajors;
  public int numOfMinors;
  public String ExpectedGradSem;
  
  public Student(){
    this.ExpectedGradSem = ExpectedGradSem; //was getting errors with this one, had to write this. operator
    Majors = new String[4];
    numOfMajors = 0;
    Minors = new String[4];
    numOfMinors = 0;
 
    
  }
  
  
  public String getMajors(){
    String s = "";
    for (int i = 0; i<numOfMajors; i++){
      if (i == numOfMajors - 1){
        s += Majors[i];
      }else{
        s += Majors[i] + ", ";
      }
    }
    //Something to note here: in the getters of the original code, the prof has written 's += "\n", which was actually causing format issues for people who only had one major.
    return s;
  }
  
  public boolean addMajor(String Major){
    if (numOfMajors < Majors.length){
      Majors[numOfMajors] = Major;
      numOfMajors ++;
      return true;
    }else{
      return false;
    }
  }
  public boolean removeMajor(String Major){
    boolean success = false;
    int location = -1;
    
    for (int i=0; i<numOfMajors; i++){
      if (Majors[i].equals(Major) ) {
        Majors[i] = null;
        success = true;
        numOfMajors--;
        location = i;
        break;
      }
    }
    if (success){
      for (int n = location;
      n<numOfMajors; n++){
        Majors[n] = Majors[n+1];
      }
      Majors[numOfMajors] = null;
    }
    return success;
  }
  
  //from the majors section except it is for Minors.I
  
    public String getMinors(){
    String s = "";
    for (int i = 0; i<numOfMinors; i++){
      if (i == numOfMinors - 1){
        s += Minors[i];
      }else{
        s += Minors[i] + ", ";
      }
    }
   //Something to note here: in the getters of the original code, the prof has written 's += "\n", which was actually causing format issues for people who only had one minor.
    return s;
  }
  
  public boolean addMinor(String Minor){
    if (numOfMinors < Minors.length){
      Minors[numOfMinors] = Minor;
      numOfMinors ++;
      return true;
    }else{
      return false;
    }
  }
  public boolean removeMinor(String Minor){
    boolean success = false;
    int location = -1;
    
    for (int i=0; i<numOfMinors; i++){
      if (Minors[i].equals(Minor) ) {
        Minors[i] = null;
        success = true;
        numOfMinors--;
        location = i;
        break;
      }
    }
    if (success){
      for (int n = location;
      n<numOfMinors; n++){
        Minors[n] = Minors[n+1];
      }
      Minors[numOfMinors] = null;
    }
    return success;
  }
  
    
  
  //this setter is used to make sure that whatever input is stated is correct. Retrieved from the moodle project page
  public void setExpectedGradSem(String Semester){
    if (Semester != null){
       switch(Semester.toUpperCase()){
      case "FALL":
        ExpectedGradSem = "Fall";
        break;
      case "SPRING":
        ExpectedGradSem = "Spring";
        break;
      case "SUMMER":
        ExpectedGradSem = "Summer";
        break;
      default:
        ExpectedGradSem = null;
        break;
      }
    }
  }
  //OK so this part of the getter is used to make sure that the semester has their FIRST LETTER uppercase, found here: https://www.geeksforgeeks.org/substring-in-java/
      //0 = starting index, 1 = ending index, (1).toLowerstring, begins descending the letters
  public String getExpectedGradSem(){
    if (ExpectedGradSem == null) {
      return null;
    } else {
      return ExpectedGradSem.substring(0, 1).toUpperCase() + ExpectedGradSem.substring(1).toLowerCase();
    } 
  }
  public void setExpectedGradYear(int GradYear){
    ExpectedGradYear = GradYear;
  }
  public int getExpectedGradYear(){
    return ExpectedGradYear;
  }
  public void setFirstName(String FName){
    FirstName = FName;
  }
  public String getFirstName(){
    return FirstName;
  }
  public void setPreferredName(String PFName){
    PreferredFirstName = PFName;
  }
  public String getPreferredName(){
    return PreferredFirstName;
  }
  public void setLastName(String LName){
    LastName = LName;
  }
  public String getLastName(){
    return LastName;
  }
  public void setTotalStudents(int StudentsAttending){
    TotalStudents = StudentsAttending;
  }
  public int getTotalStudents(){
    return TotalStudents;
  }
  public void setStudentID(long Identification){
    StudentID = Identification;
  }
  public long getStudentID(){
    return StudentID;
  }
  
  public static void main (String [] args){
    Student student = new Student();
    student.setFirstName("Anthony");
    student.getFirstName();
    student.setPreferredName("Anthony");
    student.getPreferredName();
    student.setLastName("Klytta");
    student.getLastName();
    student.setStudentID(513346); //not my actual ID, need that OPSEC
    student.getStudentID();
    student.setTotalStudents(29);
    student.getTotalStudents();
    student.setExpectedGradSem("spring"); //this is lower case to test my string method
    student.getExpectedGradSem();
    student.getMajors();
    student.addMajor("Finance");
    student.addMajor("Computer Science"); //these could be commented out, but I don't care
    student.addMajor("Elden Ring"); //these could be commented out, but I don't care
    student.getMinors();
    student.addMinor("Philosophy"); //these could be commented out, but I don't care
    student.addMinor("Magic The Gathering"); //these could be commented out, but I don't care
    student.setExpectedGradYear(2023);
    student.getExpectedGradYear();
    
    System.out.println("This program is for creating a student object, more specifically it is for a student who goes to: " + School + ".\n" + 
                   "The student's first name is: " + student.getFirstName() + ".\n" +
                   "The student's last name is: " + student.getLastName() + ".\n" +
                   "The student's preferred name is: " + student.getPreferredName() + ".\n" +
                   "The student's ID is: " + student.getStudentID() + ".\n" +
                   "This show's the student's major: " + student.getMajors() + ".\n" +
                   "This shows the student's minor: " + student.getMinors() + ".\n" +
                   "The student's expected semester for graduation: " + student.getExpectedGradSem() + ".\n" +
                   "Finally, the student is graduating in the year: " + student.getExpectedGradYear() + "."); 
  }
}