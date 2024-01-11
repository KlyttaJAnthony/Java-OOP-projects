

public class SimpleList{
  protected int x;
  protected int y;
  protected int z;
  protected String[] arrayListx;
  protected String[] arrayListy;
  protected String[] arrayListz;
  protected listIndex = 0;

  public SimpleList(int x, int y, int z){
    this.x = x;
    this.y = y;
    this.z = z;
    arrayListx = new String[100];
    arrayListy = new String[100];
    arrayListz = new String[100];
    listIndex = 0;
  }
  public String[] getArrayListx(){
    return arrayListx;
  }
  public String[] getArrayListy(){
    return arrayListy;
  }
  public String[] getArrayListz(){
    return arrayListz;
  }
  public int getListIndex(){
    return listIndex;
  }
  public int setListIndex(int index){
    listIndex = index;
  }
}
