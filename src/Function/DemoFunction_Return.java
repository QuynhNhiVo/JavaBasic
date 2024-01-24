package Function;

public class DemoFunction_Return {

    String name = "Ten";
    int age = 10;
    String address = "HoChiMinh";
    int x = 10;
    int y = 21;
    public String getName(){

        return name;
    }

    public int sum(){

        return x + y;

    }

    public int multiple(){
        return x * y;
    }

    public static void main(String[] args) {

        DemoFunction_Return obj_2 = new DemoFunction_Return();
        obj_2.getName();
        obj_2.multiple();
        System.out.println(obj_2.multiple() + obj_2.sum());

    }
}
