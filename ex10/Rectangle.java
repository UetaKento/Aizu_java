//import jeliot.io.*;

public class Rectangle implements Shape {
    private int width = 0;
    private int height = 0;
    private Point origin;

    // two constructors
    public Rectangle() {
	origin = new Point(0, 0);
    }

    public Rectangle(int w, int h) {
	origin = new Point(0, 0);
	width = w;
	height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
	origin.move(x,y);
    }

    // a method for computing the area of the rectangle
    public double getArea() {
	return  (double)width * height;
    }  
}
