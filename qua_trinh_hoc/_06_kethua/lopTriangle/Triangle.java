package _06_kethua.lopTriangle;

public class Triangle extends Shape{
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;

    public Triangle(String color, boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public Triangle(){

    }

    public double getSize1() {
        return size1;
    }

    public double getSize2() {
        return size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize1(double size1) {
        if (size1 <= 0){
            this.size1 = 0;
        }else
        this.size1 = size1;
    }

    public void setSize2(double size2) {
        if (size2 <= 0){
            this.size2 = 0;
        }else

        this.size2 = size2;
    }

    public void setSize3(double size3) {
        if (size3 <= 0){
            this.size3 = 0;
        }else
        this.size3 = size3;
    }
    public double getPerimeter(){
        return (size1 + size2 + size3);
    }
    public double getArea(){
        double p = this.getPerimeter()/2;
        return Math.sqrt(p*(p-size1)*(p- size2)*(p-size3));
    }

    @Override
    public String toString() {
        return super.toString() + "size1 = " + size1 + " size 2= " + size2 + " size3 = " + size3 ;
    }
}
