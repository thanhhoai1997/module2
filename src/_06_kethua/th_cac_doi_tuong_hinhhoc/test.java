package _06_kethua.th_cac_doi_tuong_hinhhoc;

public class test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("den",false,3.6);
        System.out.println(circle);
        Retangle retangle = new Retangle();
        System.out.println(retangle);
        retangle = new Retangle(3,5);
        System.out.println(retangle);
        retangle = new Retangle("xanh",false,5,6);
        System.out.println(retangle);
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("blue", false,7);
        System.out.println(square);
    }

}
