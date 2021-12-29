//import jeliot.io.*;
import java.util.Random;
class Engineer extends Employee{
    Engineer(){
	super(2500);
    }
    @Override
    public void generateNumberHours(){
	Random rand = new Random();
	int randi=rand.nextInt(3)+8;
	super.setH(randi);
    }
}
