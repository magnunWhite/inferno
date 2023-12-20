package org.example;

public class Circle extends Figure{
    private double radius;


    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcPerimeter(){
        return 2*Math.PI*radius;
    }

    public double calcArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
