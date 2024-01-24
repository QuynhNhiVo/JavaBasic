package Function;

public class DemoFunction_NotReturn {

    String name = "Ten";
    int age = 10;
    String address = "HoChiMinh";
    public void showInfo(){

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
    public void click(){
        System.out.println("Assign function to click");
    }

    public static void main(String[] args) {

        DemoFunction_NotReturn obj_1 = new DemoFunction_NotReturn();
        obj_1.showInfo();
        obj_1.click();

    }
}
