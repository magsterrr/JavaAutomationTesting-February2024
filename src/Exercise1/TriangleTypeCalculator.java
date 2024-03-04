package Exercise1;

import java.util.Scanner;

public class TriangleTypeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double angle1 = Double.parseDouble(scanner.nextLine());
        double angle2 = Double.parseDouble(scanner.nextLine());
        double angle3 = Double.parseDouble(scanner.nextLine());
        double totalDegreeSum = angle1 + angle2 + angle3;

        if (angle1 == 0 || angle2 == 0 || angle3 == 0) {
            System.out.println("Sorry, the angle can't be 0 degrees. That doesn't make a triangle.");
            return;
        }

        if (totalDegreeSum == 180)
        {
            System.out.println("Congrats! That makes a triangle!");
        }
        else
        {
            System.out.println("Sorry! That doesn't make a triangle :(");
            return;
        }

        if (angle1 == 90 || angle2 == 90 || angle3 == 90)
        {
            System.out.println("The triangle is right."); //правоъгълен
        }
        if (angle1 > 90 || angle2 > 90 || angle3 > 90)
        {
            System.out.println("The triangle is obtuse."); //тъп
        }
        if (angle1 < 90 && angle2 < 90 && angle3 < 90)
        {
            System.out.println("The triangle is acute."); //остър
        }
        if (angle1 == 60 && angle2 == 60 && angle3 == 60)
        {
            System.out.println("The triangle is equilateral."); //равностранен
            return;
        }
        if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1)
        {
            System.out.println("The triangle is isosceles."); //равнобедред
        }
        else
        {
            System.out.println("The triangle is scalene."); //разностранен
        }
    }
}