package _05_modifel_static.ThStaticsMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college = "CODEGYM";
    }
    void displlay(){
        System.out.println(rollno + ": " + name + ":" + college);
    }
}
