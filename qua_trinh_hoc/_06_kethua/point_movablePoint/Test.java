package _06_kethua.point_movablePoint;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("point");
        Point point = new Point();
        System.out.println(point);
        point = new Point(2,3);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
        point.setXY(6,7);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println("MovablePoint");
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
        movablePoint = new MovablePoint(6,7);
        System.out.println(movablePoint);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
        movablePoint = new MovablePoint(7,8,9,10);
        System.out.println(movablePoint);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
        System.out.println("test move");
        movablePoint.setY(5);
        movablePoint.setX(5);

        movablePoint.setxSpeed(6);
        movablePoint.setySpeed(6);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());




    }
}
