package JavaProject;

public class Swap2Numbers05 {
    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 25;

        System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
    }







}
