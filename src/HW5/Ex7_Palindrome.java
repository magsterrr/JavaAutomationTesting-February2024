package HW5;
import java.util.Scanner;

public class Ex7_Palindrome {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the word you want to validate:");
            String input = scanner.nextLine();

            boolean isPalindrome = true;
            int left = 0;
            int right = input.length() - 1;
            while (left < right) {
                if (input.charAt(left) != input.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println(input + " is a palindrome");
            } else {
                System.out.println(input + " is not a palindrome");
            }
        }
    }
