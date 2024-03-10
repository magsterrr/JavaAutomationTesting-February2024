package HW;

public class Ex1_SmallestOfThree {
    public static void main(String[] args) {
        //1. Write a Java method to find the smallest number among three numbers
        int a = 1;
        int b = 3;
        int c = 56;

        int smallestNumber = findSmallestNumber(a, b, c);
        System.out.println("The smallest number is: " + smallestNumber);
    }

    private static int findSmallestNumber(int a, int b, int c) {
        int smallestNumber = a;

        if (smallestNumber > b) {
            smallestNumber = b;
        }
        if (smallestNumber > c) {
            smallestNumber = c;
        }
        return smallestNumber;
    }
}