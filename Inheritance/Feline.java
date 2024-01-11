

public class Feline extends Animal{

  private String earShape;
  private String tailShape;

  public Feline(){
    super("Cat", "Big", 200.0); // super must be called for the constructor in order for inheritance to occur.
  }
  public Feline(String type, double weight){
    this(type, weight, "lazy", "curled");
  } //creates a


  public Feline(String type, double weight, String earShape, String tailShape){
    super(type, weight < 50 ? "Small": (weight < 100 ? "Big" : "Large"), weight); //nested tertiary operator that is passed through the super constrcutor
    this.earShape = earShape;
    this.tailShape = tailShape;
  }
  public String toString(){
    return "Feline " + earShape + " " +  tailShape + " " + super.toString(); //this call allows us to access the super class method
  }
  public static void main(String[] args){
    Feline lion = new Feline();
    doAnimalStuff(lion, "fast");
    Feline cat = new Feline("Egyptian", 20);
    doAnimalStuff(cat, "slow");
    Feline tiger = new Feline("Amazon Tiger", 250, "floppy", "wild"); //remember, the data stored in the variables must be passed one at a time in order
    doAnimalStuff(tiger, "fast");
  }
  public static void doAnimalStuff(Animal animal, String speed){
    animal.makeNoise();
    animal.move(speed);
    System.out.println(animal);
    System.out.println(" ");
  }
}
