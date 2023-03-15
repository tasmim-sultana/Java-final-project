package com.jetbrains;
abstract class Shape
{
    protected String color;
    protected boolean filled;
    public Shape()
    {
        color="green";
        filled=true;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    public abstract int getArea();
}
class Circle extends Shape {
    private int x;
    private int y;

    @Override
    public int getArea() {
        return x * y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
