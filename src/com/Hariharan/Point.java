package com.Hariharan;

public class Point {
    private int x,y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public double distance(int x,int y){
        return Math.sqrt(Math.pow(x-x,2)+Math.pow(y-y,2));
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(x-point.getX(),2)+Math.pow(y-point.getY(),2));
    }
}
