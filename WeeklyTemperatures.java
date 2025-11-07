package weeklyTemperatures;

import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Two array lists, one for days and one for temperatures
        ArrayList<String> days = new ArrayList<String>();
        ArrayList<Double> temps = new ArrayList<Double>();

        // Adding the days of the week
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // Getting a temperature for each day from user
        System.out.println("Enter the average temperature for each day of the week:");
        for (int i = 0; i < days.size(); i++) {
            System.out.print(days.get(i) + ": ");
            double t = scnr.nextDouble();
            temps.add(t);
        }

        // Clear newline before using nextLine()
        scnr.nextLine();

        // Instructions on how to use
        System.out.println();
        System.out.println("Enter a day of the week to see its temperature.");
        System.out.println("Type 'week' to show all and average, or 'exit' to quit.");

        // Main loop for the interaction
        while (true) {
            System.out.print("\nYour choice: ");
            String input = scnr.nextLine();

            // For if user wants to quit
            if (input.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            // If user wants to see all temps and average
            else if (input.equals("week")) {
                double sum = 0;
                System.out.println("\nWeekly Temperatures:");
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temps.get(i) + "°");
                    sum = sum + temps.get(i);
                }
                double average = sum / temps.size();
                System.out.println("Weekly average temperature: " + average + "°");
            }
            
            else if (input.equals("Monday") || input.equals("Tuesday") || input.equals("Wednesday")
                     || input.equals("Thursday") || input.equals("Friday")
                     || input.equals("Saturday") || input.equals("Sunday")) {

                // Find which index matches the day entered
                for (int i = 0; i < days.size(); i++) {
                    if (days.get(i).equals(input)) {
                        System.out.println(days.get(i) + ": " + temps.get(i) + "°");
                    }
                }
            }
            
            // If the user enters something invalid
            else {
                System.out.println("Invalid entry. Try again.");
            }
        }

        scnr.close();
    }
}
