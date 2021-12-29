//import jeliot.io.*;
import java.util.Random;

public class CalculatingWorkingHours {
    public static void main(String[] args) {
        // Your algorithm goes here.
	Employee[] e;
	int j=0;
	int k=0;
	int l=0;
	int m=0;
	Random rand = new Random(); 
	e = new Employee[rand.nextInt(500)]; 
	for(int i = 0; i< e.length; i++) { 
	    switch (rand.nextInt(4)) {
	    case 0: 
		e[i] = new Regular(); 
		break; 
	    case 1: 
		e[i] = new PartTime(); 
		break; 
	    case 2: 
		e[i] = new Engineer(); 
		break; 
	    case 3: 
		e[i] = new Manager();
		break; 
	    }
	}
	for(int i=0;i<e.length;i++){
	    e[i].generateNumberHours();
	    if(e[i] instanceof Regular==true){
		System.out.println("Regular 一日の給料:"+e[i].getDayPayment());
		j=j+e[i].getDayPayment();
	    }else if(e[i] instanceof PartTime==true){
		System.out.println("PartTime 一日の給料:"+e[i].getDayPayment());
		k=k+e[i].getDayPayment();
	    }else if(e[i] instanceof Engineer==true){
		System.out.println("Engineer 一日の給料:"+e[i].getDayPayment());
		l=l+e[i].getDayPayment();

	    }else{
		System.out.println("Manager 一日の給料:"+e[i].getDayPayment());
		m=m+e[i].getDayPayment();
	    }

	}
	System.out.println("");
	System.out.println("Regular 合計の給料:"+j);
	System.out.println("PartTime 合計の給料:"+k);
	System.out.println("Engineer 合計の給料:"+l);
	System.out.println("Manager 合計の給料:"+m);

    }
}
/*
	    System.out.println(e[i].getDayPayment());
	    j=j+e[i].getDayPayment();
*/
