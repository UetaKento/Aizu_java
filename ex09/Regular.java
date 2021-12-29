//import jeliot.io.*;
import java.util.Random;

class Regular extends Employee{
    Regular(){
	super(2000);
    }
    @Override
    public void generateNumberHours(){
	Random rand = new Random();
	int randi=rand.nextInt(2)+8;
	super.setH(randi);
    }
}
