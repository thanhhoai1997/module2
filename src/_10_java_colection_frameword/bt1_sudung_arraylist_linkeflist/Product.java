package _10_java_colection_frameword.bt1_sudung_arraylist_linkeflist;

public class Product {
    private String tenSanPham;
    private int id;
    private double giaSanPham;

    public Product() {
    }

    public Product(String tenSanPham, int id, double giaSanPham) {
        this.tenSanPham = tenSanPham;
        this.id = id;
        this.giaSanPham = giaSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getId() {
        return id;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        return
                "{tenSanPham='" + tenSanPham + '\'' +
                ", id=" + id +
                ", giaSanPham=" + giaSanPham +
                '}';
    }

}
