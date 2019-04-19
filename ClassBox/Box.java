package edu.softuni;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
    }

    public double surfaceArea(double length, double width, double height){
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double lateralSurfaceArea(double length, double width, double height){
        return  2 * length * height + 2 * width * height;
    }

    public double volume(double length, double width, double height){
        return length * width * height;
    }
}
