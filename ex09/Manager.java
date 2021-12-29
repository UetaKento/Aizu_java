//import jeliot.io.*;
import java.util.Random;
class Manager extends Employee{
    Manager(){
	super(2900);
    }
    @Override
    public void generateNumberHours(){
	Random rand = new Random();
	int randi=rand.nextInt(6)+6;
	super.setH(randi);
    }
}
