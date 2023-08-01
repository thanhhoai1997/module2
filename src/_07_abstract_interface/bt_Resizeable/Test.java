package _07_abstract_interface.bt_Resizeable;

public class Test {
    public static void main(String[] args) {
        Square square = new Square(7);
        square.resize(7);
        Retangle retangle = new Retangle(9,8);
        retangle.resize(100);
        Circle circle = new Circle(9.8);
        circle.resize(20);
        IResizeable[] iResizeables = new IResizeable[3];
        iResizeables[0] = circle;
        iResizeables[1] = retangle;
        iResizeables[2] = square;
        System.out.println("tang ngau nhien cac phan tu : ");
        for (IResizeable iResizeable: iResizeables  ){
            if (iResizeable instanceof Circle){
                System.out.println("dien tich ban dau cua hinh tron : " + circle.getArea());
                iResizeable.resize(Math.random()*100);
            } else if (iResizeable instanceof Retangle){
                System.out.println("dien tich ban dau cua hinh chu nhat: " + retangle.getArea());
                iResizeable.resize(Math.random()*100);
            }else {
                System.out.println("dien tich ban dau cua hinh vuong: " + square.getArea());
                iResizeable.resize(Math.random()*100);

            }



        }
    }
}
