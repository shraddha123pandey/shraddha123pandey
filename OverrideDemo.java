package javaProject;

public class OverrideDemo {
	
	
	   public static void main(String args[]) {
	     Hello subHello = new Hello(1,2,3);// Object of class Hello
	     subHello.show();
	     subHello.show("This is k:");
	     subHello.show();
	     Hi subHi= new Hi(1,1);// Object of class Hi
	     subHi.callMe();
	     subHello.callMe();
	     Bye subBye= new Bye(1,2,3,"hello");// Object of Bye class
	     subHi= subHello;
	     subHi.callMe();
	     subHi = subBye;
	     subHi.callMe();
	     
	     
	     System.out.println("=================");
	     
	     Figure fig= new Figure(3,5);
	     System.out.println("Area is: "+ fig.area());
	     BigRectangle1 rect= new BigRectangle1(4,5);
	     System.out.println("Area is: "+ rect.area());
	     Triangle tri= new Triangle(6,7);
	     System.out.println("Area is: "+ tri.area());
	     Figure figrRef ;
	     
	     figrRef= rect;
	     System.out.println("Area is: "+ figrRef.area());
	     
	     figrRef= tri;
	     System.out.println("Area is: "+ figrRef.area());
	}
}
	
class Hi{
	int i, j;
	Hi(int a, int b){
		i=a;
		j=b;
	}
	// Display i and j
	void show() {
		System.out.println("I an J is: "+i+" "+j);
	}
	void callMe() {
		System.out.println("This is Hi!");
	}
}

class Hello extends Hi{
	 int c;
	Hello(int a, int b, int c) {
		super(a, b);
		this.c=c;
	}
	// overloa show()
	void show(String msg) {
		System.out.println(msg+c);
	}
	void callMe() {
		System.out.println("This is Hello!");
	}
}
class Bye extends Hello{
	String msg;
	Bye(int a, int b, int c, String msg) {
		super(a, b, c);
		this.msg= msg;
		
		
		
	}

	void callMe() {
		System.out.println("This is Bye!");
	}
}



// Using run-time polymorphism.

class Figure{
	double dim1;
	double dim2;
	// Costructor 
	Figure(double dim1, double dim2){
		this.dim1= dim1;
		this.dim2= dim2;
	}
	double area() {
		System.out.println("Area for Figure is undefined.");
		return 0;
		
	}
}

class BigRectangle1 extends Figure{

	BigRectangle1(double dim1, double dim2) {
		super(dim1, dim2);
		
	}
	// Override area for rectangle
	double area(){
		System.out.println("Inside Area for Rectangle is: ");
		return dim1*dim2;
		}
}
class Triangle extends Figure{

	Triangle(double dim1, double dim2) {
		super(dim1, dim2);
		
	}
	double area(){
		System.out.println("Inside Area for Triangle is: ");
		return (dim1*dim2)/2;
		}
	
}


