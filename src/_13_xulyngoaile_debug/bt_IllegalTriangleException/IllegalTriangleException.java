package _13_xulyngoaile_debug.bt_IllegalTriangleException;

import java.util.InputMismatchException;

public class IllegalTriangleException extends Exception{
    private double a;
    private double b;
    private double c;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public IllegalTriangleException(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
    public  void kiemTraNgoaiLe() throws IllegalTriangleException {
        if (this.a <= 0 || this.b <= 0 || this.c <= 0){
            throw new  IllegalTriangleException("wrong side length input");
        }
        if (a+b < c || a + c < b || b + c < a){
            throw new IllegalTriangleException("í not triangle");
        }

    }
}
