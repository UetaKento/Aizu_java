//import jeliot.io.*;
abstract class Animal { 
    private int count; 
    public void increment() { this.count++; } 
    public int getCount() { return this.count; } 
    abstract void noise(); 
} 
class Dog extends Animal { 
    public Dog() {};
    public void noise() { 
	System.out.println("Woof"); 
	super.increment(); 
    } 
} 
class Cat extends Animal { 
    public Cat() {}; 
    public void noise() { 
	System.out.println("Meow"); 
	super.increment(); 
    } 
} 
public class Counter{ 
    public static void main(String[] args) { 
	Animal[] a = {new Dog(), new Cat(), new Cat(), new Dog(), new Dog()};
	Dog d=new Dog();
	Cat c=new Cat();
	for (int i = 0; i < a.length; i++){
	    if(a[i] instanceof Dog==true){
		d.noise();
	    }else if(a[i] instanceof Cat==true){
		c.noise();
	    }else{

	    }
	}
	System.out.println(d.getCount() + " woofs and " + c.getCount() + " meow"); 
    } 
} 

/*
abstract class Animal { 
   private static int count; 
   public static void increment() { count++; } 
   public static int getCount() { return count; } 
   abstract void noise(); 
} 
class Dog extends Animal { 
   public Dog() {};
   public void noise() { 
      System.out.println("Woof"); 
      increment(); 
   } 
} 
class Cat extends Animal { 
   public Cat() {}; 
   public void noise() { 
      System.out.println("Meow"); 
      increment(); 
   } 
} 
public class Counter{ 
    public static void main(String[] args) { 
      Animal[] a = {new Dog(), new Cat(), new Cat(), new Dog(), new Dog()}; 
      for (int i = 0; i < a.length; i++) 
         a[i].noise(); 
     System.out.println(Dog.getCount() + " woofs and " + Cat.getCount() + " meow"); 
    } 
} 

//import jeliot.io.*;
abstract class Animal { 
    public static int count; 
    public static void increment() { count++; } 
    public static int getCount() { return count; } 
    abstract void noise(); 
} 
class Dog extends Animal { 
    public Dog() {};
    public void noise() { 
	System.out.println("Woof"); 
	increment(); 
    } 
} 
class Cat extends Animal { 
    public Cat() {}; 
    public void noise() { 
	System.out.println("Meow"); 
	increment(); 
    } 
} 
public class Counter{ 
    public static void main(String[] args) { 
	Animal[] a = {new Dog(), new Cat(), new Cat(), new Dog(), new Dog()};
	int j=0,k=0,l=0;
	for (int i = 0; i < a.length; i++){
	    a[i].noise();
	    if(a[i] instanceof Dog==true){
		j=j+1;
		a[i].count=j;
	    }else if(a[i] instanceof Cat==true){
		k=k+1;
		a[i].count=k;
	    }else{
		l=l+1;
		a[i].count=l;
	    }
	}
	System.out.println(Dog.getCount() + " woofs and " + Cat.getCount() + " meow"); 
    } 
} 
*/
