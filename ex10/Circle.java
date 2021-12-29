//import jeliot.io.*;

public class Circle implements Shape {
    private double rad;
    private Point origin;
    public Circle(){
	this.origin=new Point(0,0);
    }
    public Circle(double d){
	origin=new Point(0,0);
	this.rad=d;
    }
    public double getArea(){
	return this.rad*this.rad*Math.PI;
    }
}
