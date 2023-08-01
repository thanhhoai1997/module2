package _07_abstract_interface.bt_Colorable;

import _07_abstract_interface.bt_Resizeable.IResizeable;

public class Retangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Retangle() {
    }

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Retangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
 public double getArea (){
        return this.length*this.width;
 }
 public double getgetPerimeter() {
     return 2 * (width + this.length);
 }

    @Override
    public String toString() {
       return  "A Circle with" +  this.width + "," +  "which is a subclass of"  + super.toString();
    }



}
