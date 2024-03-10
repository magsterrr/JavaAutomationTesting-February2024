package HW6;

public class Ex2_Average {

    public static void main(String[] args) {
        //2. Write a Java method to compute the average of three numbers.

        int a = 66;
        int b = 22;
        int c = 39;

        double average = findAverage (a, b, c);
        System.out.println("The average is: " + average);
    }

    private static double findAverage(int a, int b, int c) {

        double average;
        int sum;

        sum = a+b+c;
        average = (double) sum /3;

        return average;
    }

}
