package com.org;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "C", "C++", "", "Python", "Angular", "React", "");
        List<String> nonEmptyStrings = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}
