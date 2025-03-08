package com.poly;

import java.awt.Shape;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

}
