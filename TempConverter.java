import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int choice = 0;
       while (choice != 1 && choice != 2) {
            System.out.println("Choose the conversion type: ");
            System.out.println("1: Fahrenheit to Celsius");
            System.out.println("2: Celsius to Fahrenheit");
            choice = scanner.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }
       }
        if (choice == 1) {
            System.out.println("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("%.1f Fahrenheit is %.1f Celsius%n", fahrenheit, celsius);
        }
        else if (choice == 2) {
            System.out.println("Enter the temperature in Celsius:");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.printf("%.1f Celsius is %.1f Fahrenheit%n", celsius, fahrenheit);
        }
        scanner.close();
    }
}