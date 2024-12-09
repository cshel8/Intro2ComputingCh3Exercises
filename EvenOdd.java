import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        number = input.nextInt();
        input.close();

        if (number < 1) {
            System.out.println("Your number needs to be greater than 1.");
        }
        else if (number == 1 ) {
            System.out.println("1 is odd but neither a Prime or a Composite number.");
        }
        else {
            String evenOdd = (number % 2 == 0) ? "Even" : "Odd";
            for (int divisor = 2; divisor <= (number/2); divisor++) {
                if ((number % divisor) == 0) {
                    isPrime = false;
                    break;
                }
            }
            String primeComposite = (isPrime) ? "Prime" : "Composite";
            System.out.println(number + " is " + evenOdd + " and also a " + primeComposite + " number.");
        }
    }
}