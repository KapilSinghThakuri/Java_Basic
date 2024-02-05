package App;

public class Fox {
	private int x = 999;
    protected int y = 777;
    public String z = "I am from App Package.";
    String a = "I am Defaults attribute from App Package.";

    public static void main(String[] args) {
        Fox object = new Fox();
        System.out.println(object.x);
    }
}
