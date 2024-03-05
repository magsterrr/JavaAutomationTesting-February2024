package HW4;

import java.util.Scanner;

public class Ex4_LargestInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lengthOfArray;

        System.out.print("Enter the number of elements you want to store: ");

        lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];

        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<lengthOfArray; i++)
        {
            array[i]=scanner.nextInt();
        }

        int max = array[0];

        for(int i=0; i<array.length; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }

        System.out.print(max);
    }
}
