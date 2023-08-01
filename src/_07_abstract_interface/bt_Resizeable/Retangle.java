package _07_abstract_interface.bt_Resizeable;

import _06_kethua.th_cac_doi_tuong_hinhhoc.Shape;

public class Retangle extends Shape implements IResizeable {
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

    @Override
    public void resize(double percent) {
        System.out.println("dien tich hinh chu nhat sau khi tang " + percent + "%: " + (getArea()+ ((getArea()*percent/100))));

    }

}
