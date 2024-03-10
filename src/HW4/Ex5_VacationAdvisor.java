package HW4;

import java.util.Scanner;

public class Ex5_VacationAdvisor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination;
        double budget;

        System.out.println("What type of vacation would you like? Beach or Mountain: ");
        destination = scanner.nextLine();

        if (!destination.equals("Beach") && !destination.equals("Mountain")) {
            System.out.println("Sorry, there is no information about such a vacation.");
            return;
        }

        System.out.println("Daily budget per person: ");
        budget = scanner.nextDouble();

        if (destination.equals("Beach")) {
            if (budget >= 50){
                System.out.println("We suggest travelling outside of Bulgaria.");
            }
            if (budget < 50 && budget >0) {
                System.out.println("We suggest travelling in Bulgaria.");
            } else if (budget <=0) {
                System.out.println("Sorry, your budget is not enough to travel. Try saving.");
            }
        }
        if (destination.equals("Mountain")) {
            if (budget >= 30){
                System.out.println("We suggest travelling outside of Bulgaria.");
            }
            if (budget < 30 && budget >0) {
                System.out.println("We suggest travelling in Bulgaria.");
            }
            else if (budget <=0) {
                System.out.println("Sorry, your budget is not enough to travel.");
            }
        }


    }
}
