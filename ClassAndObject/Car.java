/**
  *This is the first program from the book by Ray Horstman.
  *@version 1 2023-05-15
  *@author Anthony Klytta
  */

  //public: public means any other class in any package can access this class
  //protected: protected allows classes in the same package and any subclasses in other packages to have access to the member
  //private: private means no other class can access this member


  public class Car{
    //Encapsulating the variables into this one class
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
      return make;
    }
    public String getModel(){
      return model;
    }
    public String getColor(){
      return color;
    }
    public boolean isConvertible(){ //the "is" in this method is common for boolean getters
      return convertible;
    }
    public void setMake(String make){
      // this.make = make; //update THIS variable with the content of the parameter make that is passed to the method.
      if (make == null) make = "Unknown"; //if the make is null, it is now unknown
      String lowercaseMake = make.toLowerCase();
      switch (lowercaseMake) {//tests if the make of the car is the three below that are supported
        case "Holden", "Porsche", "Tesla" -> this.make = make;//the only makes that can be initialized
        default -> {
          this.make = "Unsupported "; //if the make is not of the top three, the make becomes Unsupported
        }
      }
    }
    public void setModel(String model){
      this.model = model;
    }
    public void setColor(String color){
      this.color = color;
    }
    public void setDoors(int doors){
      this.doors = doors;
    }
    public void setConvertible(boolean convertible){
      this.convertible = convertible;
    }


    public void describeCar(){
      System.out.println(doors + "-Door " +
              color + " " +
              make + " " +
              model + " " +
              (convertible ? "Convertible" : ""));
    }
    public static void main(String[] args){
      Car car = new Car();
      car.setMake("Maserati");
      car.setModel("Carrera");
      car.setDoors(2);
      car.setConvertible(true);
      car.setColor("Black");


      // System.out.println("make = " + car.getMake());//
      // System.out.println("model = " + car.getModel()); //lines 49 and 48 CAN be used in an outside main method because they are retrieving the methods from the car class

      car.describeCar();


    }
  }
