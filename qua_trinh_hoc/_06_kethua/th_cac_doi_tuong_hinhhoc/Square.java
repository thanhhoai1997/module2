package _06_kethua.th_cac_doi_tuong_hinhhoc;

public class Square extends Retangle {
    public Square() {
    }

    public Square(double size) {
        super(size,size);
    }

    public Square(String color, boolean filled,double size) {
        super(color, filled, size, size);
    }
    public double getSize(){
        return this.getWidth();
    }
    public void setSize(double size){
        setWidth(size);
        setLength(size);
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
}
