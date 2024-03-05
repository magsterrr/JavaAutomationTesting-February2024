package Exercise1;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt((scanner.nextLine()));

        switch (inputNumber)
        {
            case 1:
                System.out.println("The " + inputNumber +"st day of the week is Monday.");
                return;
            case 2:
                System.out.println("The " + inputNumber +"nd day of the week is Tuesday.");
                return;
            case 3:
                System.out.println("The " + inputNumber +"rd day of the week is Wednesday.");
                return;
            case 4:
                System.out.println("The " + inputNumber +"th day of the week is Thursday.");
                return;
            case 5:
                System.out.println("The " + inputNumber +"th day of the week is Friday.");
                return;
            case 6:
                System.out.println("The " + inputNumber +"th day of the week is Saturday.");
                return;
            case 7:
                System.out.println("The " + inputNumber +"th day of the week is Sunday.");
                return;
        }

        System.out.println("Sorry, that is not a valid day of the week.");
    }
}
