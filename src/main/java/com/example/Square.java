package com.example;

public class Square extends Shape {

    // TODO: Define attributes for the square
    private int width;

    public Square(int width){
        this.width = width;
    }

    @Override
    public double area() {
        // TODO: Implement the method
        return width*width;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return width*4;
    }
}