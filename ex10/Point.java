//import jeliot.io.*;

public class Point implements Shape {
    private int x = 0;
    private int y = 0;
    // a constructor!
    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }
    // a method for moving the point
    public void move(int x, int y) {
	this.x = x;
	this.y = y;
    }
    public double getArea() {
	return  0.0;
    }  
}
