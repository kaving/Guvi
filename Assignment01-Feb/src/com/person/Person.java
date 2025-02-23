package com.person;

public class Person {
    private int age =18;
    private String name;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printPerson(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}
