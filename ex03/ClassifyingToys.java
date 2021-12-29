//import jeliot.io.*;

public class ClassifyingToys {
    public static String hantei(double x,double y,double z){
	String ans;
	if(x*x+y*y>z*z){
	    return ans="acute-angled";
	}else if(x*x+y*y<z*z){
	    return ans="obtuse-angled";
	}else{
	    return ans="right-angled";
	}
    }
    public static void main(String[] args) {
        // Your algorithm goes here.
	double [][] haire={
	    {0.3,0.4,0.5},
	    {2,3,4},
	    {5,12,13},
	    {19.0,19.0,19.0},
	    {6,7,11},
	    {11,13,17},
	    {7,24,25}
	};
	String A;
	A=hantei(0.3,0.4,0.5);
	System.out.println("(0.3,0.4,0.5)triangle="+A);
	A=hantei(2,3,4);
	System.out.println("(2,3,4)triangle="+A);
	A=hantei(5,12,13);
	System.out.println("(5,12,13)triangle="+A);
	A=hantei(19.0,19.0,19.0);
	System.out.println("(19.0,19.0,19.0)triangle="+A);
	A=hantei(6,7,11);
	System.out.println("(6,7,11)triangle="+A);
	A=hantei(11,13,17);
	System.out.println("(11,13,17)triangle="+A);
	A=hantei(7,24,25);
	System.out.println("(7,24,25)triangle="+A);
    }
}
