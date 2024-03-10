package HW5;

import java.util.Scanner;

public class Ex6_SumOfDiagonal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = 4;
        int columns = 4;
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix: ");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }
        System.out.println("Matrix entered!");

        int sum = calculateSumOfDiagonal(matrix);
        System.out.println("The sum of the diagonal elements: " + sum);
    }

    public static int calculateSumOfDiagonal (int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
        }
        return sum;
    }
}