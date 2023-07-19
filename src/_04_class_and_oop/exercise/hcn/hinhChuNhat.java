package _04_class_and_oop.exercise.hcn;

public class hinhChuNhat {
    double width ;
    double height;
    public hinhChuNhat(){

    }
    public hinhChuNhat(double w, double h){
        this.width = w;
        this.height = h;
    }
    public  double getArea(){
        return  this.width*this.height;

    }
    public  double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public String display(){
        return "width = " + this.width + " heigth = " + this.height;

    }
}
