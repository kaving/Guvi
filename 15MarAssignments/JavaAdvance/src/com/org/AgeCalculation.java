package com.org;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculation {    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your birthdate in yyyy-MM-dd format: ");
            String dob = sc.next();
            LocalDate date = LocalDate.parse(dob, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDate now = LocalDate.now();
            Period period = Period.between(date, now);
            System.out.println("Your age is: " + period.getYears() + " years"+ period.getMonths() + " months" + period.getDays() + " days");
        }
    }
}
