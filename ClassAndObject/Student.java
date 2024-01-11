

public class Student{

  private String id;
  private String name;
  private String dateOfBirth;
  private String classList;

  public Student(String id, String name, String dateOfBirth, String classList){
    this.id = id;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.classList = classList;
  }
  public String toString(){
    return "Student{" +
    "id='" + id + " " +
    ", name='" + name + "' " +
    ", dateOfBirth='" + dateOfBirth + "' " +
    ", classList='" + classList + "' " +
    '}';
  }



  public static void main(String[] args){

    for(int i = 1; i <= 5; i++){
      Student s = new Student("S93200" + i,
      switch (i) {
        case 1 -> "Anthony";
        case 2 -> "Tom";
        case 3 -> "Alex";
        case 4 -> "Brandon";
        default -> "Anon";
      },
      "09/17/1997";
      "Java Masterclass";
      );
    }
  }
}
