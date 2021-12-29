//import jeliot.io.*;
package calcobj;
public class Rectangle {
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

/*
    public static void main() {
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
*/
