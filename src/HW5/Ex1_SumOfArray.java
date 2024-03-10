package HW5;

import java.util.Scanner;

public class Ex1_SumOfArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lengthOfArray;

        System.out.println("Enter the number of elements in your array: ");
        lengthOfArray = scanner.nextInt();
        double[] array = new double[(int) lengthOfArray];

        System.out.println("Enter the elements that you want to sum: ");

        for (int i = 0; i < lengthOfArray; i++) {
            array[i]=scanner.nextDouble();
        }

        double sum = array[0];

        for (int i = 1; i < lengthOfArray; i++) {
            sum = sum + array[i];
        }

        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
