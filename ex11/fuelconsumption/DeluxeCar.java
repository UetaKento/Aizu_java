//import jeliot.io.*;
package fuelconsumption;

class DeluxeCar extends AdvancedCar{
    DeluxeCar(float a,float b,float c,float d,String e){
	super(a,b,c,d,e);
	super.FE=14.0f;
	super.ACFE=10.5f;
	if(super.M.equals("Van")){
	    super.FE=10.5f;
	    super.ACFE=6.0f;
	}
    }
    /*
      float calculateFuelConsumptionOldRegulations(){

      }
      float calculateFuelConsumptionNewRegulations(){

      }
    */
}
/*
  public class DeluxeCar {
  public static void main() {
  // Your algorithm goes here.

  }
  }
*/
