//import jeliot.io.*;
package fuelconsumption;

class SimpleCar{
    float TTBW;
    float TTFW;
    float TNOKTBAC;
    float TNOHTWP;
    String M;
    float FE;
    float ACFE;
    
    SimpleCar(float a,float b,float c,float d,String e){
	this.TTBW=a;
	this.TTFW=b;
	this.TNOKTBAC=c;
	this.TNOHTWP=d;
	this.M=e;
	this.FE=13.0f;
	this.ACFE=0.0f;
    }
    float calculateFuelConsumptionOldRegulations(){
	if(this.ACFE==0.0f){
	    return this.TNOKTBAC/this.FE+0;
	}else{
	    return this.TNOKTBAC/this.FE+(this.TTFW-this.TTBW)/this.ACFE;
	}
    }
    float calculateFuelConsumptionNewRegulations(){
	if(this.ACFE==0.0f){
	    return this.TNOKTBAC/this.FE+0;
	}else if(ACFE==9.5f){
	    return this.TNOKTBAC/this.FE+(this.TTFW-this.TTBW)/this.ACFE;
	}else{
	    return this.TNOKTBAC/this.FE+this.TNOHTWP/this.ACFE;
	}
    }
}

/*
  public class SimpleCar {
  public static void main() {
  // Your algorithm goes here.

  }
  }
*/
