//import jeliot.io.*;

public class TestRelatable {
    public static void main(String[] args) {
        // Your algorithm goes here.
        int max=0;
        MyRectangle r[] = {
	    new MyRectangle(5, 10),
	    new MyRectangle(15, 20),
	    new MyRectangle(11, 13),
	    new MyRectangle(10, 7),
	};
	for(int i=0;i<r.length;i++){
	    System.out.println("r"+i+":"+r[i].getPerimeter());
	    if(r[i].getPerimeter()>max){
		max=r[i].getPerimeter();
	    }
	}
	System.out.println("最大値："+ max);
    }
}
/*
  for(int i=0;i<r.length;i++){
  if(i+1<r.length){
  switch (r[i].isLargerThan(r[i+1])) {
  case 1:
  System.out.println("r"+i+ " is greater than r"+(i+1));
  break;
  case 0:
  System.out.println("r"+i+ " is equal to r"+(i+1));
  break;
  default:
  System.out.println("r"+i+ " is less than r"+(i+1));
  break;
  }
  }
  }
  switch (r[0].isLargerThan(r[1])) {
  case 1:
  System.out.println("r0 is greater than r1");
  break;
  case 0:
  System.out.println("r0 is equal to r1");
  break;
  default:
  System.out.println("r0 is less than r1");
  break;

  }
*/
