//import jeliot.io.*;

public class Sphere {
    float hank;
    Sphere(float x){
	this.hank=x;
    }
    public double calcVol(){
	double x;
	return x=4.0*Math.PI*this.hank*this.hank*this.hank/3.0;
    }
    public float calcHei(float r1,float r2){
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
/*
    public static float calc(float y){
	return z=4*Math.PI*y*y*y/3;
    }
*/
