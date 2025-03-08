import java.util.HashMap;
import java.util.Scanner;

package com.org;

public class Weekday {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day position (0 for Sunday, 6 for Saturday): ");
        int dayIndex = scanner.nextInt();

        try {
            System.out.println("Day: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Day index is out of range. Please enter a value between 0 and 6.");
        }
    }
}