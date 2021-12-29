//import jeliot.io.*;

class Rectangle {
    // Your algorithm goes here.
    int hei;
    int len;   
    Rectangle(int h,int l){
	this.hei=h;
	this.len=l;
    }
    public int calall(){
	int x=2*this.hei+2*this.len;
	return x;
    }
}

class Box extends Rectangle{
    // Your algorithm goes here.
    //int hei;
    int wid;
    //int len;
    Box(int h,int w,int l){
	this.hei=h;
	this.wid=w;
	this.len=l;
    }
    public int calall(){
	int x=4*this.hei+4*this.wid+4*this.len;
	return x;
    }
}

public class TestObjects {
    public static void main(String[] args) {
	int x,y;
	Rectangle rec=new Rectangle(5,4);
	Box box=new Box(5,4,3);
	//x=rec.calall();
	//y=box.calall();
	System.out.println("RectangleHeight;"+rec.hei+" RectangleLength;"+rec.len+" 周りの長さ;"+rec.calall());
	System.out.println("BoxHeight;"+box.hei+" BoxWidth;"+box.wid+" BoxLength;"+box.len+" 周りの長さ;"+box.calall());
    }
}
