package com.example;

public class Triangle extends Shape {

    // TODO: Define attributes for the triangle
    private int width;
    private int height;
    private int length;

    public Triangle(int width, int height, int length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public double area() {
        // TODO: Implement the method
        return width * height / 2;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return width + height + length;
    }
}

// TODO: Implement similar classes for Circle and Square
