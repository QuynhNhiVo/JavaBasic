package Static;

public class BlockStatic {

    static String name;
    static {
        //Run first in a Class
        System.out.println("Block static");
        name = "Selenium";
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}
