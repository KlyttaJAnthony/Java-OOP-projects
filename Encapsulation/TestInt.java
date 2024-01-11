

public class TestInt{
    private int x;
    private int y;

    public void setInt(int setX, int setY){
        this.x = setX;
        this.y = setY;
    }

    public int getIntx(){
        return x;
    }
    public int getInty(){
        return y;
    }
    public static void main(String[] args){
        TestInt testInt = new TestInt();
        testInt.setInt(1, 2);
        System.out.println(testInt.getIntx());
        System.out.println(testInt.getInty());
    }
}