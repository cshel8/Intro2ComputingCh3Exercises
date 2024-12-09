import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string to check if it is a palindrome.");
        String original = scanner.nextLine();
        original = original.replace(" ", "");

        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        boolean palindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if(original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if(palindrome) {
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}