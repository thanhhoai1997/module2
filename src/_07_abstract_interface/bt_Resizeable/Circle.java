package _07_abstract_interface.bt_Resizeable;

import _06_kethua.th_cac_doi_tuong_hinhhoc.Shape;

public class Circle extends Shape implements IResizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   public double getArea (){
        return radius*radius*Math.PI;

    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return  "A Circle with" +  this.radius + "," +  "which is a subclass of"  + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("dien tich tron sau khi tang " + percent + "% : " + (getArea()+ (getArea()*percent/100)) );
    }
}
