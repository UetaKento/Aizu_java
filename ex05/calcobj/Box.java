//import jeliot.io.*;
package calcobj;
public class Box {
    // Your algorithm goes here.
    int hei;
    int wid;
    int len;
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
/*
public class BBox extends Box{
    int d;
}

public static void main() {
    // Your algorithm goes here.
    int hei;
    int wid;
    int len;
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
*/
