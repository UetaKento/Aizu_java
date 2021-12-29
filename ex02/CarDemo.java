import jeliot.io.*;

public class CarDemo {
    public static void main() {
        // Your algorithm goes here.
	Car c1=new Car();
	Car.constructor();
	Car.speedUp(5);
	Car.tarvelledTime(2);
	Car.printStateTank();
	Car c2=new Car();
	Car.speedUp(7);
	Car.tarvelledTime(4);
	Car.printStateTank();
	Car c3=new Car();
	Car.speedUp(9);
	Car.tarvelledTime(6);
	Car.printStateTank();
    }
}
