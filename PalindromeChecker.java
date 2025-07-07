import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scan.nextLine();
        scan.close();

        // Remove spaces and punctuation, and convert to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the string is a palindrome
        if (isPalindrome(cleanInput)) {
            System.out.println("The string '" + input + "' is a palindrome.");
        } else {
            System.out.println("The string '" + input + "' is not a palindrome.");
        }
    }

private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}