//import jeliot.io.*;

class Sphere {
    float hank;
    Sphere(float x){
	this.hank=x;
    }
    public double calcVol(){
	double x;
	return x=4.0*Math.PI*this.hank*this.hank*this.hank/3.0;
    }
    public float heightContactPoint(float r1,float r2){
	float x;
	if(r1>r2){
	    return x=r1-((r1*r1-r1*r2)/(r1+r2));
	}else if(r1==r2){
	    return x=r1;
	}else{
	    return x=r2-((r2*r2-r2*r1)/(r2+r1));
	}
    }
}

public class TestSphere {
    public static void main(String[] args) {
        // Your algorithm goes here.
	Sphere s1=new Sphere(2.5f);
	Sphere s2=new Sphere(3.7f);
	Sphere s3=new Sphere(3.7f);
	System.out.println("s1の半径は"+s1.hank);
	System.out.println("s2の半径は"+s2.hank);
	System.out.println("s3の半径は"+s3.hank);
	System.out.println("s1の体積は"+s1.calcVol());
	System.out.println("s2の体積は"+s2.calcVol());
	System.out.println("s3の体積は"+s3.calcVol());
	System.out.println("s1とs2の接触点の高さは"+s1.heightContactPoint(2.5f,3.7f));
	System.out.println("s2とs3の接触点の高さは"+s2.heightContactPoint(3.7f,3.7f));
	System.out.println("s3とs1の接触点の高さは"+s3.heightContactPoint(3.7f,2.5f));
    }
}
