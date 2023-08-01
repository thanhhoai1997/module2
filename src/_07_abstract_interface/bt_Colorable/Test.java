package _07_abstract_interface.bt_Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(8);
        Retangle retangle = new Retangle(9,10);
        Square square = new Square(6);
        shapes[0] = circle;
        shapes[1] = retangle;
        shapes[2] = square;
        for (Shape shape: shapes){
            if (shape instanceof Circle){
                System.out.println("hinh tron: " + circle.getArea());
            }else if (shape instanceof Retangle){
                System.out.println("hinh chu nhat " + retangle.getArea());
            }else {
                System.out.println("hinh vuong " + square.getArea());
            }
            if (shape instanceof IColorable){
                ((IColorable) shape).howToColor();
            }

        }




    }


}
