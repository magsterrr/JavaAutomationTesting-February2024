package HW5;

public class Ex4_PrintMaxOfArray {

    public static void main(String[] args) {

        int[] array = {1, 88, 3, 402, 54, 6, 79, 8, 66, 99};
        int largestNumber = findLargestNumber(array);

        System.out.println("The largest number in the array is: " + largestNumber);
    }

    public static int findLargestNumber(int[] array) {
        int largestNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
        }

        return largestNumber;
    }
}