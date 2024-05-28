package week1.day2;

public class PalindromeNumbers {
	public static void main(String[] args) {
        int input = 12321;
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int input) {
        int originalNumber = input;
        int reversedNumber = 0;
        for (int i = input; i > 0; i /= 10) {
            int rem = i % 10;
            reversedNumber = reversedNumber * 10 + rem;
        }
        return originalNumber == reversedNumber;
    }
}

