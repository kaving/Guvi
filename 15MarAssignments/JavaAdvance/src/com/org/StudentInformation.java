package com.org;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentInformation {
    /**
     * There are 10 students decided to give special gifts to those who name start with A.
     * Java program to separate those, who name start with A.
     * List interface to store the names of the students.
     * lambda expression and Stream API to filter the names.
     */
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Amit", "Arun", "John", "Anil", "Ankit", "Aman", "Rahul", "Alok", "Ankur", "Rohit");
        List<String> studentsWithA = students.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println("Students with name starting with A: " + studentsWithA);
    }
}
