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

}

class Square extends Rectangle {
    public Square(String name,int x,int y){
	super(name,x,y);
    }
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

}

public class TestFigures {
    public static void main(String[] args) {
	// Your algorithm goes here.
	Circle c1=new Circle("c1",3.0);
	System.out.println(c1.toString());
	System.out.println("周囲の長さ:"+c1.calcmawari());
	System.out.println("面積:"+c1.calcmenseki());
	Rectangle rec1=new Rectangle("rec1",3,4);
	System.out.println(rec1.toString());
	System.out.println("周囲の長さ:"+rec1.calcmawari());
	System.out.println("面積:"+rec1.calcmenseki());
	Square s1=new Square("s1",3,3);
	System.out.println(s1.toString());
	System.out.println("周囲の長さ:"+s1.calcmawari());
	System.out.println("面積:"+s1.calcmenseki());
	Parallelogram p1=new Parallelogram("p1",3,4,5,6,7);
	System.out.println(p1.toString());
	System.out.println("周囲の長さ:"+p1.calcmawari());
	System.out.println("面積:"+p1.calcmenseki());
	Rhombus rho1=new Rhombus("rho1",3,3,4,5);
	System.out.println(rho1.toString());
	System.out.println("周囲の長さ:"+rho1.calcmawari());
	System.out.println("面積:"+rho1.calcmenseki());
    }
}


/*
class Circle extends Shape {
    String name;
    int hankei;
    public Circle(String name,int x){
	super(name);
	this.hankei=x;
    }
    public String toString() {
	return getClass().getName() + " " + name + " " + this.hankei;
    }
    public int calcmawari(){
	int x;
	return x=2*Math.PI*this.hankei;
	//System.out.println("周囲 "+x);
    }
    public int calcmenseki(){
	int x;
	return x=this.hankei*this.hankei*Math.PI;
    }
}

class Rectangle extends Shape {
    String name;
    int rinhen1,rinhen2;
    public Rectangle(String name,int x,int y){
	this.name=name;
	this.rinhen1=x;
	this.rinhen2=y;	
    }
    public String toString() {
	return getClass().getName() + " " + this.name + " " + this.rinhen1 + " " + this.rinhen2;
    }
    public int calcmawari(){
	int x;
	return x=2*this.rinhen1+2*this.rinhen2;
    }
    public int calcmenseki(){
	int x;
	return x=this.rinhen1*this.rinhen2;
    }

}

class Square extends Rectangle {
    String name;
    int hen;
    public Square(String name,int x){
	this.name=name;
	this.hen=x;
    }
    public String toString() {
	return getClass().getName() + " " + this.name + " " + this.hen;
    }
    public int calcmawari(){
	int x;
	return x=4*this.hen;
    }
    public int calcmenseki(){
	int x;
	return x=this.hen*this.hen;
    }
}

class Parallelogram extends Rectangle {
    String name;
    int rinhen1,rinhen2,taikaku; 
    public Rectangle(String name,int x,int y,int z){
	this.name=name;
	this.rinhen1=x;
	this.rinhen2=y;
	this,taikaku=z;
    }
    public String toString() {
	return getClass().getName() + " " + this.name + " " + this.rinhen1 + " " + this.rinhen2+ " " + this.taikaku;
    }
    public int calcmawari(){
	int x;
	return x=2*this.rinhen1+2*this.rinhen2;
    }
    public int calcmenseki(){
	int x;
	return x=this.rinhen1*this.rinhen2;
    }
}

class Rhombus extends Square {

}

public class TestFigures {
    public static void main(String[] args) {
        // Your algorithm goes here.
	Rectangle r1=new Rectangle("Rectangle",5);
	System.out.println(r1.toString());
	//System.out.println("周囲 "+r1.calcmawari());
	Square s1=new Square("Square",7);
	System.out.println(s1.toString());
	//System.out.println("周囲 "+s1.calcmawari());
    }
}
	System.out.println(r1.toString());
	System.out.println("周囲 "+r1.calcmawari());

 */
