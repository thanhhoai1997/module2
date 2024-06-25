package _04_class_and_oop.prative.Fan;

public class Fan {
    final int slow = 1;
    final int media = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){

    }
    public void setSpeed(int x){
        this.speed = x;


    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(int x){
        this.radius = x;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if (on){
            return "speed : " + this.speed + " color : " + color + " radius: " + this.radius;
        }else {
            return "color : " + color + " radius: " + this.radius + " fan is off";
        }
    }
}
