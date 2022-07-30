package com.perscholas.java_basics;

public class JavaBasicClass {
	
	
	public static void main(String[] args) {
		//1. two integer variables
		int int1 = 1, int2 = 2;
		int intSum = int1 + int2;
		System.out.println(intSum);
		
		//2. two double variables
		double double1 = 1.23, double2 =3.4;
		double doubleSum = double1 + double2;
		System.out.println(doubleSum);
		
		//3. declares an integer variable and a double variable, assigns numbers to each, and adds them together. 
		//sum is either int or double
		int int3 = 1;
		double double3 = 3.14;
		int intSum3 = (int)double3 + int3;
		double doubleSum3 = (double)int3 + double3;
		System.out.println(intSum3);
		System.out.println(doubleSum3);
		
		//4. divides the larger number by the smaller number. Assign the result to a variable. Print out the result. 
		//Now change the larger number to a decimal. 
		double max = Math.max(double1, double2);
		double min = Math.min(double1, double2);
		double divide4 = max / min;
		System.out.println(divide4);
		System.out.println((int)divide4);
		
		//5. 
		int x = 5, y = 6;
		int q = y / x;
		System.out.println(q);
		System.out.println((double)y);
		
		//6.
		double PI = 3.14;
		double radius = 5;
		double perimeter = 2 * PI * radius;
		System.out.println(perimeter);
		
		//7.
		double SALES_TAX = 0.065;
		double coffee = 1, tea = 2, espresso = 3;
		double subtotal, totalSale;
		subtotal = coffee * 3 + tea * 4 + espresso * 2;
		totalSale = subtotal + subtotal * SALES_TAX;
		System.out.println(String.format("%.2f", totalSale));

		
	}
	
}
