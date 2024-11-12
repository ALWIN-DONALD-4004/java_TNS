package com.tnsif.abstruction;

public class Rectangle extends Shape {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void getArea() {  // Implementing the abstract method from Shape
        area = length * width;
        show();
    }
}
