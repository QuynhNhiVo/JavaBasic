package If_Else;

public class DemoIf_Else {
    public static void main(String[] args) {

        String gender = "Nam";
        int age = 20;
        if (age > 18 && gender.equals("Nam")) {
            System.out.print("Nam, > 18");
        }else {
            System.out.println("<=18");
        }

        // Test Login
        // Login true
        // 1. URL has not "Login"
        // 2. Not display header login
        // 3. Display menu Dashboard
//        if (url.contains("/admin/") && header.getText() != "Login" && menu.isDisplayed()){
//            System.out.println("Login success");
//        }else {
//            System.out.println("Login false");
//        }
    }
}
