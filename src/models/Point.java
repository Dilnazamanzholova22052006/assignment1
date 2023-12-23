package models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
    return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double xVar){
        this.x=xVar;
    }
    public void setY(double yVar){
        this.y=yVar;
    }
    @Override public String toString(){
        return  x+ ":"+y;
    }
    // distance(Point dest) - distance from current point to the dest point
    public double distance(Point dest) {
        return Math.sqrt(Math.pow(dest.x - this.x, 2) + Math.pow(dest.y - this.y, 2));
    }
    }
// toString

