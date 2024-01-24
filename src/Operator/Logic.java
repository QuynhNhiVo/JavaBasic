package Operator;

public class Logic {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 15;

        System.out.println((a > b) && (b > c));
        System.out.println((a > b) && (b > c) || (a > c));
        System.out.println((a > b) || (b > c));

    }
}
