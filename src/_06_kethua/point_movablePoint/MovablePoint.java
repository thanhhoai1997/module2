package _06_kethua.point_movablePoint;

import _06_kethua.th_cac_doi_tuong_hinhhoc.Circle;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public MovablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float arr[] = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
    return arr;
    }

    @Override
    public String toString() {
        return super.toString() + "," + "speed = " + "{" + this.xSpeed + " ; " +  this.ySpeed +  "}";
    }
    public MovablePoint move(){
       this.setX(this.getX()+this.xSpeed);
       this.setY(this.getY()+ this.ySpeed);
       return this;

    }
}
