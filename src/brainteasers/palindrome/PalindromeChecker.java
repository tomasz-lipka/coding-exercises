package brainteasers.palindrome;

/**
 * Exercise:
 * Check if a given word is a palindrome
 */
public class PalindromeChecker {

    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        word = deleteWhiteSpaces(word);
        for (int i = 0, j = word.length() - 1; i < word.length(); i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private String deleteWhiteSpaces(String word) {
        return word.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        System.out.println(palindromeChecker.isPalindrome("Anna")); //true
        System.out.println(palindromeChecker.isPalindrome("AnnA")); //true
        System.out.println(palindromeChecker.isPalindrome("An.nA")); //true
        System.out.println(palindromeChecker.isPalindrome("Was it a cat I saw")); //true
        System.out.println(palindromeChecker.isPalindrome("abcd")); //false
        System.out.println(palindromeChecker.isPalindrome("abcde")); //false

    }
}