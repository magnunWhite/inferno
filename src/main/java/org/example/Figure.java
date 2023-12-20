package org.example;

public abstract class Figure {
    private Color color;
    public Figure(Color color)
    {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double perimeter();
    public abstract double area();

}
