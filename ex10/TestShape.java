//import jeliot.io.*;
import java.util.Random;

public class TestShape {
    public static void main(String[] args) {
        // Your algorithm goes here.
	Random r=new Random();
	double d=0.0;
	Shape[] s={
	    new Point(r.nextInt(10),r.nextInt(10)),
	    new Point(r.nextInt(10),r.nextInt(10)),
	    new Point(r.nextInt(10),r.nextInt(10)),
	    new Circle(r.nextDouble()+1),
	    new Circle(r.nextDouble()+3),
	    new Circle(r.nextDouble()+5),
	    new Circle(r.nextDouble()+7),
	    new Rectangle(r.nextInt(20),r.nextInt(20)),
	    new Rectangle(r.nextInt(20),r.nextInt(20)),
	    new Rectangle(r.nextInt(20),r.nextInt(20)),
	    new Rectangle(r.nextInt(20),r.nextInt(20)),
	    new Rectangle(r.nextInt(20),r.nextInt(20)),
	};
	for(int i=0;i<s.length;i++){
	    System.out.println("面積:"+s[i].getArea());
	    d=d+s[i].getArea();
	}
	System.out.println("合計面積:"+d);
    }
}
/*
for(int i=0;i<s.length;i++){
	    if((i>=0)&&(i<3)){
		s[i]=new Point(r.nextInt(10),r.nextInt(10));
	    }else if((i>=3)&&(i<7)){
		s[i]=new Circle(r.nextDouble(10));
		d=d+s[i].getArea();
	    }else{
		s[i]=new Rectangle(r.nextInt(20),r.nextInt(20));
		d=d+s[i].getArea();
	    }
	}
 */
