package _06_kethua.lopCirclevaCylender;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius,color );
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getTheTich(){
        return  height*Math.pow(super.getRadius(),2)*Math.PI;
    }

    @Override
    public String toString() {

        return "Cylinder{" +
                "height=" + height + " radius = " + super.getRadius() + " color = " + this.getColor()+
                '}';
    }
}
