//import jeliot.io.*;

class Shape {
    private String name;
    public Shape(String name) { 
	this.name = name;
    }
    public Shape() {
	name = "no name";
    }
    public String getName() {
	return name;
    }
    public String toString() {
	return getClass().getName() + " " + name;
    }
}
class Circle extends Shape {
    double hankei;
    public Circle(String name,double x){
	super(name);
	this.hankei=x;
    }
    public String toString() {
	return super.toString()+" 半径:"+this.hankei;
    }
    public double calcmawari(){
	return 2*Math.PI*this.hankei;
	//System.out.println("周囲 "+x);
    }
    public double calcmenseki(){
	return this.hankei*this.hankei*Math.PI;
    }
    public boolean equals(Object obj) {
	if (this == obj){
	    //System.out.println("あああ1");
	    return true;
	}
	else if(obj == null) {
	    //System.out.println("あああ2");
	    return false;
	}
	else if(this.getClass() != obj.getClass()){
	    //System.out.println("あああ3");
	    return false;
	}
	else {
	    Circle other = (Circle)obj;
	    if(this.getName().equals(other.getName()) && this.hankei == other.hankei){
		//System.out.println("あああ4");
		return true;
	    }
	    else{
		//System.out.println("あああ5");
		return false;
	    }
	}
    }
}

class Rectangle extends Shape {
    int hen1,hen2;
    public Rectangle(String name,int x,int y){
	super(name);
	this.hen1=x;
	this.hen2=y;	
    }
    public String toString() {
	return super.toString()+" 縦:"+this.hen1+" 横:"+this.hen2;
    }
    public int calcmawari(){
	return 2*this.hen1+2*this.hen2;
    }
    public int calcmenseki(){
	return this.hen1*this.hen2;
    }
    public boolean equals(Object obj) {
	if (this == obj){
	    return true;
	}
	else if(obj == null) {
	    return false;
	}
	else if(this.getClass() != obj.getClass()){
	    return false;
	}
	else {

	    Rectangle other = (Rectangle)obj;

	    if(this.getName().equals(other.getName()) && this.hen1 == other.hen1 && this.hen2 == other.hen2){
		return true;
	    }
	    else{
		return false;
	    }
	}
    }

}

class Square extends Rectangle {
    public Square(String name,int x,int y){
	super(name,x,y);
    }
    /*
    public boolean equals(Object obj) {
	if (this == obj){
	    return true;
	}
	else if(obj == null) {
	    return false;
	}
	else if(this.getClass() != obj.getClass()){
	    return false;
	}
	else {
	    Square other = (Square)obj;
	    if(this.getName().equals(other.getName()) && super.hen1 == other.hen1 && super.hen2 == other.hen2){
		return true;
	    }
	    else{
		return false;
	    }
	}
    }
    */
}

class Parallelogram extends Rectangle {
    int taikaku1,taikaku2,takasa; 
    public Parallelogram(String name,int x,int y,int z1,int z2,int h){
	super(name,x,y);
	this.taikaku1=z1;
	this.taikaku2=z2;
	this.takasa=h;
    }
    public String toString() {
	return super.toString()+" 対角線1:"+this.taikaku1+" 対角線2:"+this.taikaku2;
    }
    public int calcmenseki(){
	return super.hen2*this.takasa;
    }
    public boolean equals(Object obj) {
	if (this == obj){
	    return true;
	}
	else if(obj == null) {
	    return false;
	}
	else if(this.getClass() != obj.getClass()){
	    return false;
	}
	else {
	    Parallelogram other = (Parallelogram)obj;
	    if(this.getName().equals(other.getName()) && this.taikaku1 == other.taikaku1 && this.taikaku2 == other.taikaku2
	       && this.takasa == other.takasa){
		return true;
	    }
	    else{
		return false;
	    }
	}
    }
}

class Rhombus extends Square {
    int taikaku1,taikaku2;
    public Rhombus(String name,int x,int y,int z1,int z2){
	super(name,x,y);
	this.taikaku1=z1;
	this.taikaku2=z2;
    }
    public String toString() {
	return super.toString()+" 対角線1:"+this.taikaku1+" 対角線2:"+this.taikaku2;
    }
    public int calcmenseki(){
	return this.taikaku1*this.taikaku2/2;
    }
    public boolean equals(Object obj) {
	if (this == obj){
	    return true;
	}
	else if(obj == null) {
	    return false;
	}
	else if(this.getClass() != obj.getClass()){
	    return false;
	}
	else {
	    Rhombus other = (Rhombus) obj;
	    if(this.getName().equals(other.getName()) && this.taikaku1 == other.taikaku1 && this.taikaku2 == other.taikaku2){
		return true;
	    }
	    else{
		return false;
	    }
	}
    }
}

public class TestFigures2 {
    public static void main(String[] args) {
	// Your algorithm goes here.
	Circle c1=new Circle("c1",3.0);
	System.out.println(c1.toString());
	System.out.println("周囲の長さ:"+c1.calcmawari());
	System.out.println("面積:"+c1.calcmenseki());
	
	Circle c2=new Circle("c2",4.0);
	System.out.println(c2.toString());
	System.out.println("周囲の長さ:"+c2.calcmawari());
	System.out.println("面積:"+c2.calcmenseki());

	System.out.println(c1.equals(c2));


	
	Rectangle rec1=new Rectangle("rec1",3,4);
	System.out.println(rec1.toString());
	System.out.println("周囲の長さ:"+rec1.calcmawari());
	System.out.println("面積:"+rec1.calcmenseki());

	Rectangle rec2=new Rectangle("rec2",4,5);
	System.out.println(rec2.toString());
	System.out.println("周囲の長さ:"+rec2.calcmawari());
	System.out.println("面積:"+rec2.calcmenseki());
	
	System.out.println(rec1.equals(rec2));


	
	Square s1=new Square("s1",3,3);
	System.out.println(s1.toString());
	System.out.println("周囲の長さ:"+s1.calcmawari());
	System.out.println("面積:"+s1.calcmenseki());

	Square s2=new Square("s2",4,4);
	System.out.println(s2.toString());
	System.out.println("周囲の長さ:"+s2.calcmawari());
	System.out.println("面積:"+s2.calcmenseki());

	System.out.println(s1.equals(s2));


	
	Parallelogram p1=new Parallelogram("p1",3,4,5,6,7);
	System.out.println(p1.toString());
	System.out.println("周囲の長さ:"+p1.calcmawari());
	System.out.println("面積:"+p1.calcmenseki());
	
	Parallelogram p2=new Parallelogram("p2",4,5,6,7,8);
	System.out.println(p2.toString());
	System.out.println("周囲の長さ:"+p2.calcmawari());
	System.out.println("面積:"+p2.calcmenseki());

	System.out.println(p1.equals(p2));


	
	Rhombus rho1=new Rhombus("rho1",3,3,4,5);
	System.out.println(rho1.toString());
	System.out.println("周囲の長さ:"+rho1.calcmawari());
	System.out.println("面積:"+rho1.calcmenseki());

	Rhombus rho2=new Rhombus("rho2",5,5,3,4);
	System.out.println(rho2.toString());
	System.out.println("周囲の長さ:"+rho2.calcmawari());
	System.out.println("面積:"+rho2.calcmenseki());

	System.out.println(rho1.equals(rho2));

	
    }
}


