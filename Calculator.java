import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + mul(num1, num2));
        System.out.println("Division: " + div(num1, num2));
        System.out.println("Modulus: " + mod(num1, num2));
        input.close();
    }
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static int mul(int num1, int num2) {
        return num1 * num2;
    }
    public static double div(double num1, double num2) {
        if (num2 == 0) {
            System.err.println("Can't be divided by zero");
            return 0;
        }
        return num1 / num2;
    }
    public static int mod( int num1, int num2) {
        if (num2 == 0) {
            System.err.println("Modulus by zero is not allowed");
            return 0;
        }
        return num1 % num2;
    }
}