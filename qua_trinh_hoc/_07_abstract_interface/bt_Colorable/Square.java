package _07_abstract_interface.bt_Colorable;

import _07_abstract_interface.bt_Resizeable.IResizeable;

public class Square extends Shape implements IColorable {
    private double size;
    public Square() {
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Square(double size) {
        this.size = size;
    }


    public double getArea(){
        return getSize()*2;

    }


    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + ", which is a subclass of "+  super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides..");
    }
}
