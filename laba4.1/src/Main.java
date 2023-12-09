
import java.util.Scanner;

 class PalindromeChecker {

    public static boolean isPalindrome(String word) {

        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();


        int length = cleanedWord.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedWord.charAt(i) != cleanedWord.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        if (isPalindrome(inputWord)) {
            System.out.println(inputWord + " is a palindrome :)");
        } else {
            System.out.println(inputWord + " is not a palindrome :(");
        }

        scanner.close();
    }
}

