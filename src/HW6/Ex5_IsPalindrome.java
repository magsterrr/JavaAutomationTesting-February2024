package HW6;

public class Ex5_IsPalindrome {

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 12345;

        System.out.println(num1 + " is a palindrome: " + isPalindrome(num1));
        System.out.println(num2 + " is a palindrome: " + isPalindrome(num2));
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false; // negative numbers are not palindromes
        }

        int reversed = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}
