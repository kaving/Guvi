package com.org;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentInformation {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Amit", "Arun", "John", "Anil", "Ankit", "Aman", "Rahul", "Alok", "Ankur", "Rohit");
        List<String> studentsWithA = students.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println("Students with name starting with A: " + studentsWithA);
    }
}
