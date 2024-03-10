package HW6;

import java.util.Scanner;

public class Ex4_IsEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Int argument: ");
        int input = scanner.nextInt();

        boolean even = isEven(input);

        if (input == 0) {    //input is 0
            System.out.println("0 is neither even nor uneven.");
            return;
        }
        if (!even) {
            System.out.println("The number is uneven.");
        }
        else {
            System.out.println("The number is even.");
        }

    }
    public static boolean isEven(int input) {
        boolean even = false;

        even = input % 2 == 0;

        return even;
    }
}
