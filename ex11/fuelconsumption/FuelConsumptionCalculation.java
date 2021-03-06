//import jeliot.io.*;
package fuelconsumption;

class  FuelConsumptionCalculation {
    private double fuelConsumptionOldRegulation = 0.0f;
    private double fuelConsumptionNewRegulation = 0.0f;
    private SimpleCar[] cars;
    /*
    FuelConsumptionCalculation(){
	SimpleCar[] cars=new SimpleCar[4];
	cars[0]=new SimpleCar(7.0f,18.0f,130.0f,8.0f,"Nissan");
	cars[1]=new AdvancedCar(8.5f,18.0f,155.0f,8.0f,"Toyota");
	cars[2]=new DeluxeCar(7.5f,18.0f,140.0f,5.25f,"Honda");
	cars[3]=new DeluxeCar(12.0f,18.0f,10.5f,3.0f,"Van");
	this.cars=cars;
	calculateFuelConsumption();
	
    }
    FuelConsumptionCalculation(SimpleCar[] cars){
	this.cars=cars;
	calculateFuelConsumption();
    } 
    */
    private void calculateFuelConsumption(float f1,float f2){
	fuelConsumptionOldRegulation+=f1;
	System.out.println(fuelConsumptionOldRegulation);
	fuelConsumptionNewRegulation+=f2;
	System.out.println(fuelConsumptionNewRegulation);
    }
    
    float getFuelConsumptionOldRegulations(){
	return (float)fuelConsumptionOldRegulation;
    }
    
    float getFuelConsumptionNewRegulations(){
	return (float)fuelConsumptionNewRegulation;
    }
}

/*
  public class FuelConsumptionCalculation {
  public static void main() {
  // Your algorithm goes here.

  }
  }



class  FuelConsumptionCalculation {
    private double fuelConsumptionOldRegulation = 0.0f;
    private double fuelConsumptionNewRegulation = 0.0f;
    private SimpleCar[] cars;
    FuelConsumptionCalculation(){
	SimpleCar[] cars=new SimpleCar[4];
	cars[0]=new SimpleCar(7.0f,18.0f,130.0f,8.0f,"Nissan");
	cars[1]=new AdvancedCar(8.5f,18.0f,155.0f,8.0f,"Toyota");
	cars[2]=new DeluxeCar(7.5f,18.0f,140.0f,5.25f,"Honda");
	cars[3]=new DeluxeCar(12.0f,18.0f,10.5f,3.0f,"Van");
	this.cars=cars;
	calculateFuelConsumption();
	
    }
    FuelConsumptionCalculation(SimpleCar[] cars){
	this.cars=cars;
	calculateFuelConsumption();
    } 
    private void calculateFuelConsumption(){
	fuelConsumptionOldRegulation+=cars[0].calculateFuelConsumptionOldRegulations();
	System.out.println(fuelConsumptionOldRegulation);
	fuelConsumptionOldRegulation+=cars[1].calculateFuelConsumptionOldRegulations();
	System.out.println(fuelConsumptionOldRegulation);
	fuelConsumptionOldRegulation+=cars[2].calculateFuelConsumptionOldRegulations();
	System.out.println(fuelConsumptionOldRegulation);
	fuelConsumptionOldRegulation+=cars[3].calculateFuelConsumptionOldRegulations();
	System.out.println(fuelConsumptionOldRegulation);
	fuelConsumptionNewRegulation+=cars[0].calculateFuelConsumptionNewRegulations();
	System.out.println(fuelConsumptionNewRegulation);
	fuelConsumptionNewRegulation+=cars[1].calculateFuelConsumptionNewRegulations();
	System.out.println(fuelConsumptionNewRegulation);
	fuelConsumptionNewRegulation+=cars[2].calculateFuelConsumptionNewRegulations();
	System.out.println(fuelConsumptionNewRegulation);
	fuelConsumptionNewRegulation+=cars[3].calculateFuelConsumptionNewRegulations();
	System.out.println(fuelConsumptionNewRegulation);
    }
    
    float getFuelConsumptionOldRegulations(){
	return (float)fuelConsumptionOldRegulation;
    }
    
    float getFuelConsumptionNewRegulations(){
	return (float)fuelConsumptionNewRegulation;
    }
   
    public static void main(String[] args) {
        // Your algorithm goes here.
	FuelConsumptionCalculation cars=new FuelConsumptionCalculation();
	System.out.println("OldRegulation:"+cars.fuelConsumptionOldRegulation);
	System.out.println("NewRegulation:"+cars.fuelConsumptionNewRegulation);
    }
}
*/
