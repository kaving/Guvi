package com.org;

import java.util.stream.Stream;

public class convertStringstoUpper {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("Java", "C", "C++", "Python", "Angular", "React");
        names.map(String::toUpperCase).forEach(System.out::println);
    }
}
