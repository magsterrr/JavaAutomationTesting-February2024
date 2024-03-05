package Exercise2;

import java.util.Scanner;

public class EligibleToWorkCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt((scanner.nextLine()));

        if (inputNumber >= 16) {
            System.out.println("Congrats! You are eligible to work.");
        }
        else {
            System.out.println("Sorry! You are not eligible to work");
        }
    }
}

