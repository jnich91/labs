import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String input = getInput();

        System.out.println("Checking for palindromeness.....");

        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome)
            System.out.println("Your string is a palindrome!");
        else
            System.out.println("Your string is NOT a palindrome");
    }

    private static String getInput() {
        System.out.println("What string would you like to check?");

        try(Scanner scanner = new Scanner(System.in))
        {
            return scanner.nextLine();
        }
    }

    private static boolean checkPalindrome(String input) {
        String normalizedStr = input.replaceAll("[^A-Za-z0-9]", "");

        return normalizedStr.equalsIgnoreCase(new StringBuilder(normalizedStr).reverse().toString());
    }
}