package Variable;

import javax.lang.model.element.Name;

public class LocalVariable {

    public String getName(){
        String Name = "Bien cuc bo";
        return Name;
    }

    public void showInfo(){
//        System.out.println(Name);
        String Name = "Local Variable of Function showInfo";
        System.out.println(Name);

    }

    public static void main(String[] args) {

//        int num1;
        int num2 = 123;
//        System.out.println(num1);
        System.out.println(num2);

    }
}
