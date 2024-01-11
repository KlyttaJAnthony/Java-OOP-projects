
/**by setting setters and getters we can control what information the users or programs see
 * this is highly important to make sure that data does not spill out from other files
 * this one in particular only allows for Strings
 */
public class Test{
    private String HelloWorld;

    public void setString(String newHelloWorld){
        this.HelloWorld = newHelloWorld;
    }
    public String getString(){
        return HelloWorld;
    }
    public static void main(String[] args){
        Test myObj = new Test();
        myObj.setString("Hello world");
        System.out.println(myObj.getString());

    }
}

