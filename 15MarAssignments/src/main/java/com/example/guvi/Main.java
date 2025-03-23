package com.example.guvi;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        calclulateSumadnAverage();
            }
        
            private static void calclulateSumadnAverage() {
                List<Integer> numbers = List.of(10,20,30,40,50);
                int sum = 0;
                numbers.stream().forEach(number -> sum += number);
                System.out.println("Sum of numbers: " + sum);   
                System.out.println("Average of numbers: " + sum/numbers.size());
            }
}