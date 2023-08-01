package _07_abstract_interface.interface_comparable;

import _06_kethua.th_cac_doi_tuong_hinhhoc.Circle;

public class ComparableCircle extends Circle implements IComparable {
    public ComparableCircle(){

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int conpareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()){
            return 1;
        }else if (getRadius() < o.getRadius()){
            return -1;
        }
        else {
            return 1;
        }
    }
}
