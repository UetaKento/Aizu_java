import jeliot.io.*;

public class Car {
    int horsePower;
    int speed;
    int fuelConsumption;
    int gasTask;
    int travelledTime;
    int time;

    Car(){
        horsePower=20;
        speed=0;
        fuelConsumption=2;
        gasTask=100;
        travelledTime=200;
    time=0;
    }
    void speedUp(int inc){
        this.speed=this.speed+inc;
    }
    void applyBrakes(int dec){
        this.speed=this.speed+dec;
    }
    void tarvelledTime(int t){
        this.travelledTime=this.travelledTime+t;
        this.time=t;
    }
    void printStateTank(){
        System.out.println(this.gasTask-((this.speed*this.time)/this.fuelConsumption));
    }
}

public class CarDemo {
    public static void main() {
        // Your algorithm goes here.
    Car c1=new Car();
    c1.speedUp(5);
    c1.tarvelledTime(2);
    c1.printStateTank();
    Car c2=new Car();
    c2.speedUp(7);
    c2.tarvelledTime(4);
    c2.printStateTank();
    Car c3=new Car();
    c3.speedUp(9);
    c3.tarvelledTime(6);
    c3.printStateTank();
    }
}
