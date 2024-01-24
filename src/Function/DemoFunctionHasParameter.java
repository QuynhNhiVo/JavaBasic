package Function;

public class DemoFunctionHasParameter {

    public int sum(int a, int b){

        return a + b;
    }

    public double multiple(int a, int b){
        return a * b;
    }

    public double sum1(int a, double b){
        return a + b;

    }


    public static void main(String[] args) {

        DemoFunctionHasParameter obj_2 = new DemoFunctionHasParameter();

        System.out.println(obj_2.multiple(5, 6));
        System.out.println(obj_2.sum(1, 4));
        System.out.println(obj_2.sum1(2, 5.6));

    }
}
