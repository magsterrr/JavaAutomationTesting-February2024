package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide your first name: ");

        String firstName = scanner.nextLine();

        System.out.println("Hello "+firstName + " !");

    }
}