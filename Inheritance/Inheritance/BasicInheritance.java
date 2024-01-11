

public class BasicInheritance{

  protected int x;
  protected int y;
  protected int z;

  public BasicInheritance(int x, int y, int z){
    this.x = x;
    this.y = y;
    this.z = z;
  }
  public void loopingX(){
    for(int i = x; i < 10 + x; i++){
      System.out.println(i);
    }
    int z;
      switch(i){
        case 1:
        z = x;
        System.out.println(z);
        break;
      default:
        break;
      }
    }
  }
  public static void main(String[] args){
    BasicInheritance basicInheritance = new BasicInheritance(0, 0, 0);
    basicInheritance.loopingX();
  }
}
