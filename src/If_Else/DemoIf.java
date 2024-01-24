package If_Else;

import javax.lang.model.element.Name;

public class DemoIf {
    public static void main(String[] args) {

        String gender = "Nam";
        int age = 20;
        if (age > 18 && gender.equals("Nam")) {
            System.out.print("Nam, tuổi lớn hơn 18");
        }
    }
}
