package HW5;

import java.util.Scanner;

public class Ex2_PrintMatrix {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = 4;
        int columns = 3;

        int[] [] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix: ");

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns ; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }
        System.out.println("Matrix entered!");

        System.out.println("Your 2D Matrix now looks like this: ");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns ; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
