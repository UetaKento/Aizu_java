//import jeliot.io.*;
import java.util.Random;
class PartTime extends Employee{
    PartTime(){
	super(1000);
    }
    @Override
    public void generateNumberHours(){
	Random rand = new Random();
	int randi=rand.nextInt(5);
       	super.setH(randi);
    }
}
