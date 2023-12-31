package _14_io_textfile.bt_doc_file_csv;

public class QuocGia {
    public static int count = 0;
    private int id;
    private String code;
    private String name;

    public QuocGia() {
        this.id = ++count;
    }

    public QuocGia( String code, String name) {
        this.id = ++count;
        this.code = code;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        QuocGia.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "QuocGia{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
