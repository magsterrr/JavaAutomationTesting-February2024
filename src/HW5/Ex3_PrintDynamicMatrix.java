package HW5;

import java.util.Scanner;

public class Ex3_PrintDynamicMatrix {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;

        System.out.println("Number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Number of columns: ");
        columns = scanner.nextInt();

        int[] [] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix: ");

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns ; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }
        System.out.println("Matrix entered!");

        System.out.println("Your Matrix now looks like this: ");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns ; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
