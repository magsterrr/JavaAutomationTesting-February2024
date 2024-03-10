package HW6;

public class Ex3_MiddleChar {

    public static void main(String[] args) {
        //3. Write a Java method to display the middle character of a string.
        //Note:
        //a) If the length of the string is even there will be two middle characters.
        //b) If the length of the string is odd there will be one middle character.

        String str1 = "hello";
        String str2 = "skillo";

        System.out.println("Middle character(s) of \"" + str1 + "\": " + middleCharacter(str1));
        System.out.println("Middle character(s) of \"" + str2 + "\": " + middleCharacter(str2));
    }

    public static String middleCharacter(String str) {
        int length = str.length();
        int mid = length / 2;

        if (length % 2 == 0) { // even
            return str.substring(mid - 1, mid + 1);
        } else { // odd
            return str.substring(mid, mid + 1);
        }
    }
}
