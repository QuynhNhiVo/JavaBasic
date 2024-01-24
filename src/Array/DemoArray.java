package Array;

public class DemoArray {
    public static void main(String[] args) {

        String mangName[] = new String[5];
        mangName[0] = "Java";
        mangName[1] = "Python";
        mangName[2] = "C#";
        mangName[3] = "C++";

        for (int i =0; i < mangName.length; i++){
            System.out.println(mangName[i]);
        }

        //Improve
        for (String name : mangName){
            System.out.println(name);
        }

    }
}
