package SwitchCase;

public class DemoSwitchCase {

    public static void main(String[] args) {

        String browser = "Chrome";

        switch (browser){
            case "Chrome":
                System.out.println("Browser Chrome");
                break;
            case "Edge":
                System.out.println("Browser Edge");
                break;
            case "FireFox":
                System.out.println("Browser FireFox");
                break;
            default:
                System.out.println("Default");
        }
    }
}
