//import jeliot.io.*;
import fuelconsumption.*;

public class TestPackage {
    public static void main() {
        // Your algorithm goes here.
	SimpleCar[] s={
	    new SimpleCar(7.0f,18.0f,130.0f,8.0f,"Nissan"),
	    new AdvancedCar(8.5f,18.0f,155.0f,8.0f,"Toyota"),
	    new DeluxeCar(7.5f,18.0f,140.0f,5.25f,"Honda"),
	    new BusTaxi(7.0f,18.5f,13.2f,5.75f,"Mercedes",10.0f),
	    new BusTaxi(1.0f,24.0f,26.4f,5.75f,"Mercedes",10.0f),
	};
	for(int i=0;i<s.length;i++){
	    FuelConsumptionCalculation.calculateFuelConsumption(s[i].calculateFuelConsumptionOldRegulations(),(s[i].calculateFuelConsumptionNewRegulations());
	}
	System.out.println(FuelConsumptionCalculation.getFuelConsumptionOldRegulations());
	System.out.println(FuelConsumptionCalculation.getFuelConsumptionNewRegulations());
    }
}
