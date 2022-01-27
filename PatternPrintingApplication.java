/*
 *Write an application that displays a rectangle (Border :
 *# and fill : R) ,a square (border: ^ and fill: S), 
 *an oval (@), an arrow (*), 
 * Hexagon (Border : * and fill: -) ,
 *Perfect Triangle (border: ! and fill: $) ,  
 *Triangle either left or right (Border:+ and  fill: A), 
 *and a diamond (Border : * and fill : &).
 
 Name- Shraddha Pandey 
 Registration No.- 20MEI10029

// Assignment-4
 */

package javaProject;

import java.util.Scanner;

public class PatternPrintingApplication{
	
	public static void main(String[] args) {

		System.out.println("What opertation do you want to perform:");
		System.out.println("1. For printing the Rectangle (Border :# and fill : R)-");
		System.out.println("2. For printing the Square (border: ^ and fill: S)-");
		System.out.println("3. For printing the Ovel (@)-");
		System.out.println("4. For printing the Arrow (*)-");
		System.out.println("5. For printing the  Hexagon (Border : * and fill: -)-");
		System.out.println("6. For printing the Perfect Triangle (border: ! and fill: $)-");
		System.out.println("7. For printing the RightTriangle-");
		System.out.println("8. For printing the Diamond( Border (*) and fill with (&)-");
		System.out.println("8. For printing the Hollow Diamond-");
		System.out.println("10. For printing the Diamond(fill with (*))-");
		System.out.println("11. For printing the Hollow Rectangle-");
		System.out.println("==========================================================");
		System.out.println("Enter the option->");
		Scanner intInput= new Scanner(System.in);	
		int choice = intInput.nextInt();
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
	/*****************swich case statement to access the method in the main main method*****************/
		System.out.print("Enter the option:");
		
			switch(choice){
		
			case 1: 
				rectangle();
				break;
			case 2:
				square();
				break;
			case 3:
				ovel();
				break;
			case 4:
				arrow();
				break;
			case 5: 
				hexagone();
				break;
			case 6:
				perfectTriangle();
				break;
			case 7:
				rightTriangle();
				break;
			case 8:
				diamond();
				break;
			case 9:
				hollowDiamond();
				break;
			case 10:
				diamond1();
				break;
			case 11:
				hollowRectangle();
				break;
			
			default:
				System.out.println("invalid option ! please enter the correct one:");
				break;		
		}
			intInput.close();
	}
	
	
	
	// 11. Method to print the rectangle
		private static void hollowRectangle() {
			System.out.println("Enter the length of the rectangle(l) ->");
			System.out.println("----------------------------------------------------");
			Scanner s= new Scanner(System.in);
			int sq= s.nextInt();
			for(int i= 1; i<=sq/2; i++) {
				for(int k=1;k<=sq;k++) {
					if (i==sq/2||i==1)
						System.out.print("#"+" ");
					else
						if(k==sq||k==1)
							System.out.print("#"+" ");
						else
							System.out.print(" "+" ");
				}
				System.out.println();
			}
			s.close();
		}
	
	// 10. Method to print the diamond shape
		private static void diamond1() {
			System.out.println("Enter the length(number of rows) of the Diamond->");
			System.out.println("----------------------------------------------------");
			Scanner d= new Scanner(System.in);
			int n= d.nextInt();
			for(int i =1; i<=n; i++) {
				for(int j= n; j>=i;j-- ) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j= 1; j<(i-1)*2; j++) {
					System.out.print("*");
				}
				if(i==1) {
					System.out.println();
				}else {
					System.out.print("*\n");
				}
			}
			// print the lower triangle
			for(int i= n-1; i>=1; i--) {
				for(int j= n; j>=i; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=1;j<=(i-1)*2; j++) {
					System.out.print("*");
				}
				if(i==1) {
					System.out.println();
				}else {
					System.out.print("*\n");
				}
			}
			d.close();
						
			 
	   }
	
// 9. Method to print the diamond shape
		private static void hollowDiamond() {
			System.out.println("Enter the length(number of rows) of the Diamond->");
			System.out.println("----------------------------------------------------");
			Scanner d= new Scanner(System.in);
			int n= d.nextInt();
			for(int i =1; i<=n; i++) {
				for(int j= n; j>=i;j-- ) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j= 1; j<(i-1)*2; j++) {
					System.out.print(" ");
				}
				if(i==1) {
					System.out.println();
				}else {
					System.out.print("*\n");
				}
			}
			// print the lower triangle
			for(int i= n-1; i>=1; i--) {
				for(int j= n; j>=i; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=1;j<=(i-1)*2; j++) {
					System.out.print(" ");
				}
				if(i==1) {
					System.out.println();
				}else {
					System.out.print("*\n");
				}
			}
			d.close();
						
			 
	   }
// 8. Method to print the diamond shape
	private static void diamond() {
		System.out.println("Enter the length(number of rows) of the Diamond->");
		System.out.println("----------------------------------------------------");
		Scanner d= new Scanner(System.in);
		int n= d.nextInt();
		for(int i =1; i<=n; i++) {
			for(int j= n; j>=i;j-- ) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j= 1; j<(i-1)*2; j++) {
				System.out.print("&");
			}
			if(i==1) {
				System.out.println();
			}else {
				System.out.print("*\n");
			}
		}
		// print the lower triangle
		for(int i= n-1; i>=1; i--) {
			for(int j= n; j>=i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1;j<=(i-1)*2; j++) {
				System.out.print("&");
			}
			if(i==1) {
				System.out.println();
			}else {
				System.out.print("*\n");
			}
		}
		d.close();
					
		 
   }
	
 // 7. Method to print the RightTriangle.
	private static void rightTriangle() {
		System.out.println("Enter the length of the Triangle->");
		System.out.println("----------------------------------------------------");
		Scanner d= new Scanner(System.in);
		int n= d.nextInt();
		for(int i= 1; i<=n; i++) {
			for(int k=1;k<=i;k++) {
				if (i==n)
					System.out.print("+");
				else
					if(k==1||k==i)
						System.out.print("+");
					else
						System.out.print("A");
			}
			System.out.println();
		}
		d.close();
		
		
	}

// 6. Method to print the PerfectTriangle
	private static void perfectTriangle() {
		System.out.println("Enter the length of the perfect Triangle->");
		System.out.println("----------------------------------------------------");
		Scanner p= new Scanner(System.in);
		int pt= p.nextInt();
		for(int i= 1; i<= pt; i++) {
			for(int j= 1; j<=pt-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if (i==pt)
					System.out.print("!");
				else
					if(k==1||k==2*i-1)
						System.out.print("!");
					else
						System.out.print("$");
			}
			System.out.println();
		}
		p.close();
		
	}

// 5. Method to print the hexagon
	private static void hexagone() {
		// ***********Printing the upper part************
		System.out.print("Enter the length of the hexagone:");
		System.out.println("----------------------------------------------------");
		Scanner h= new Scanner(System.in);
		int hg= h.nextInt();
		for(int i= 1 ; i<=hg;i++) {
			int elem= i+hg;
			for(int j= 1; j<=elem;j++) {
				// prints the star
				if((j==hg+i-1)||(j==hg-i-1)) {
					System.out.print("*");
				}
				else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		/***********print the middle part Here we will be 
		printing two vertical lines****************/
		for(int k=1 ; k<=hg-1; k++) {
			for(int j=1; j<=2*hg-1;j++) {
				if(j==1||j==2*hg-1) {
					System.out.print("*");
				}else {
					System.out.print("-");
				}
				
			}
			System.out.println();
			
		}
		
		/************** print the lower part******************/
		int r= hg-1;
		for(int m= r; m>=0; m--) {
			int element= m+hg;
			for(int j= 1; j<=element; j++) {
				if((j==hg+m-1)||(j==hg-m-1)) {
					System.out.print("*");
				}else {
					
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		h.close();	
	}

//4. Method to print the arrow.
	private static void arrow() {
		System.out.println("Enter the length of the Arrow(a)->");
		System.out.println("----------------------------------------------------");
		Scanner ar= new Scanner(System.in);
		int arrow= ar.nextInt();// arrow =5
		for(int i=1; i<=arrow; i++) {
			if(i!=arrow) {
				for(int k= 1;k<=arrow;k++) {
					System.out.print(" ");
				}
			}
			for(int j= 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==arrow-1) {
				for(int f=0; f<arrow;f++) {
					System.out.print("*");
				}
			}
		}
		for(int i=1; i<=arrow; i++) {
			for(int k=1; k<=arrow; k++) {
			System.out.print(" ");}
			for(int j= arrow-1; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		ar.close();
		
	}
//3. Method to print the Ovel. 
	private static void ovel() {
		System.out.print("Enter the height and of the ovel(a, b):");
		System.out.println("----------------------------------------------------");
		Scanner h= new Scanner(System.in);
		System.out.print("Enter a:");
		int a= h.nextInt();
		System.out.print("Enter b:");
		int b= h.nextInt();
		for(int i=0; i<=2*b;i++) {
			for(int j= 0; j<=2*a;j++) {
				double dist=  Math.sqrt(((i-b)*(i-b))+((j-a)*(j-a)));
				if(dist> a-0.5&& dist<b+0.5) {
					System.out.print("@");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		h.close();
	}

//2. Method to print the square pattern.
	private static void square() {
		System.out.println("Enter the length of the square(a)->");
		System.out.println("----------------------------------------------------");
		Scanner s= new Scanner(System.in);
		int sq= s.nextInt();
		for(int i= 1; i<=sq; i++) {
			for(int k=1;k<=sq;k++) {
				if (i==sq||i==1)
					System.out.print("^"+" ");
				else
					if(k==sq||k==1)
						System.out.print("^"+" ");
					else
						System.out.print("S"+" ");
			}
			System.out.println();
		}
		s.close();
	}
	
// 1. Method to print the rectangle
	private static void rectangle() {
		System.out.println("Enter the length of the rectangle(l) ->");
		System.out.println("----------------------------------------------------");
		Scanner s= new Scanner(System.in);
		int sq= s.nextInt();
		for(int i= 1; i<=sq/2; i++) {
			for(int k=1;k<=sq;k++) {
				if (i==sq/2||i==1)
					System.out.print("#"+" ");
				else
					if(k==sq||k==1)
						System.out.print("#"+" ");
					else
						System.out.print("R"+" ");
			}
			System.out.println();
		}
		s.close();
	}
}