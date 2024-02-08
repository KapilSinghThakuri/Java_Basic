package App;

public class Fox {
	private int x = 999;
    protected int y = 777;
    public String z = "I am from App Package.";
    String a = "I am Defaults attribute from App Package.";
// Adding Methods
    public int add(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println("This is App.Fox Package");
    }
}
