package _07_abstract_interface.bt_Resizeable;

import _06_kethua.th_cac_doi_tuong_hinhhoc.Retangle;
import _07_abstract_interface.interface_comparable.IComparable;

public class Square extends Retangle implements IResizeable {
    public Square() {
    }

    public Square(double size) {
        super(size,size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }
    public double getSize(){
        return this.getWidth();
    }
    public void setSize(double size){
        setWidth(size);
        setLength(size);
    }
    public double getArea(){
        return getSize()*2;

    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + ", which is a subclass of "+  super.toString();
    }

    @Override
    public void resize(double percent) {
        double area = getSize()*2;
        System.out.println("dien tich hinh vuong sau khi tang " + percent + "% : " + (area + ((area)*percent)/100) );
    }
}
