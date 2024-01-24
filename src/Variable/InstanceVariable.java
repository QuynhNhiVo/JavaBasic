package Variable;

public class InstanceVariable {
    String instance = "Bien toan cuc";

    public String getName(){
        String Name = "Bien cuc bo";
        System.out.println(instance);
        return Name;
    }

    public void showInfo(){
//        System.out.println(Name);
        String Name = "Local Variable of Function showInfo";
        System.out.println(Name);
        System.out.println(instance);

    }

    public static void main(String[] args) {

//        int num1;
        int num2 = 123;
//        System.out.println(num1);
        System.out.println(num2);
        System.out.println(StaticVariable.staticVar);
    }
}

