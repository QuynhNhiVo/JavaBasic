package Static;

public class Student {

    public int phone = 12345678;
    public static String name = "Web";

    public static void showInfo(){
        System.out.println(name);
    }

    public void testLogin(){
        System.out.println(Company.URL);
        System.out.println(Company.email);
        System.out.println(Company.password);
    }

    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.phone);

        System.out.println(Company.companyName);//Call from class Company
        System.out.println(Company.companyAddress);

        showInfo();//Call directly
        student.testLogin();

        Company.showInf();

    }

}
