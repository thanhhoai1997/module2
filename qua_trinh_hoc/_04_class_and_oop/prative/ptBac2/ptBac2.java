package _04_class_and_oop.prative.ptBac2;

public class ptBac2 {
  private   double a;
  private   double b;
  private   double c;
    public ptBac2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDelta(){
        return Math.pow(this.b,2) - 4*this.a*this.c;
    }
    public double getX1(){
        if (this.getDelta() < 0){
            return 0;
        }else if (this.getDelta() == 0){
            return (-this.b/2*a);
        }else {
            return (-this.b + Math.sqrt(this.getDelta()))/2*this.a;
        }
    }
    public double getX2(){
        if (this.getDelta() < 0){
            return 0;
        }else if (this.getDelta() == 0){
            return (-this.b/2*a);
        }else {
            return (-this.b - Math.sqrt(this.getDelta()))/2*this.a;
        }
    }
}
