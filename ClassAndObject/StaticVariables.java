

class Dog{
  private static String name;


  public Dog(String name){
    Dog.name = name;
  }
  public void printName(){
    System.out.println("name = " + name);
  }
}

public class main{
  public static void main(String[] args){

    Dog rex = new Dog("Rex"); //creates instance of Dog assigned as Rex
    Dog fluffy = new Dog("Fluffy"); //creates instance of Dog assigned as Fluffy

    rex.printName(); //prints Fluffy
    fluffy.printName(); //print Fluffy

    //both methods are going to cast out as Fluffy because the final variable are shared between each together
    //also because the Fluffy instance was given the grace of being the final instance.
  }
}
