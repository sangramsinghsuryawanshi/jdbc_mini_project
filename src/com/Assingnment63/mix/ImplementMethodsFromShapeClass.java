package com.Assingnment63.mix;

abstract class Shape 
{
    abstract void calArea();
}

class Circle extends Shape 
{
    private double radius;
    public Circle(double radius) 
    {
        this.radius = radius;
    }
    public void calArea() 
    {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle is: " + area);
    }
}

class Triangle extends Shape 
{
    private double base;
    private double height;
    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }
    public void calArea() 
    {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle is: " + area);
    }
}

public class ImplementMethodsFromShapeClass 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(2.0);
        circle.calArea();

        Triangle triangle = new Triangle(2.0, 2.0);
        triangle.calArea();
    }
}
