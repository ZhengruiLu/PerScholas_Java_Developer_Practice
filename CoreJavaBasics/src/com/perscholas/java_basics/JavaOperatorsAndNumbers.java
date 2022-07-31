package com.perscholas.java_basics;

public class JavaOperatorsAndNumbers {
	public static void main(String[] args) {
		/*
		 1. convert manually
		 1  1
		 8  1000
		 33 100001
		 78 1001110
		 787 1100010011
		 33987 1000010011000011
		 */
		//check answers
//		System.out.println(Integer.toBinaryString(1));
//		System.out.println(Integer.toBinaryString(8));
//		System.out.println(Integer.toBinaryString(33));
//		System.out.println(Integer.toBinaryString(78));
//		System.out.println(Integer.toBinaryString(787));
//		System.out.println(Integer.toBinaryString(33987));
		
		/*
		 2. convert manually
		 write a function compute manually
		 */
//		System.out.println(binaryToDecimal("0010"));	
//		System.out.println(binaryToDecimal("1001"));	
//		System.out.println(binaryToDecimal("00110100"));	
//		System.out.println(binaryToDecimal("01110010"));	
//		System.out.println(binaryToDecimal("001000011111"));	
//		System.out.println(binaryToDecimal("0010110001100111"));
		
		//check answers		
//		System.out.println(Integer.parseInt("0010",2));
//		System.out.println(Integer.parseInt("1001",2));
//		System.out.println(Integer.parseInt("00110100",2));
//		System.out.println(Integer.parseInt("01110010",2));
//		System.out.println(Integer.parseInt("001000011111",2));
//		System.out.println(Integer.parseInt("0010110001100111",2));
		
		/*
		 3. 
		 	num  binary decimal(left shift by 1) binary(left shift by 1)
			2    0010   4                        100
			9    1001   18                       10010
			17   10001  34                       100010
			88   1011000 198                     10110000
		 */
//		check answers	
//		question3(2);
//		question3(9);
//		question3(17);
//		question3(88);
		
		/*
		 4. 
		 	num  binary decimal(left shift by 1) binary(left shift by 1)
			150  10010110     37                   100101
			225  11100001     56                   111000
			1555 11000010011  388   			   110000100
			32456 111111011001000 8114             1111110110010
		 */
//		check answers	
//		System.out.println(Integer.toBinaryString(32456));	
//		question4(32456);
		
		/*
		 5. 
		 	num  binary  &(decimal) &(binary)
		     7    00111   1    		1
			 17   10001   23		10111
		 */
//		question5(7, 17);
				
//		question6(5);
		
		//7. 
//		int x = 8;
//		System.out.println(x);
//		x++;
//		System.out.println(x);
//		++x;
//		System.out.println(x);
//		x += 1;
//		System.out.println(x);
		
		//8.
		int x8 = 5, y8 = 8;
		++x8;
		int sum = x8 + y8;
		System.out.println(sum);
		
		x8 = 5;
		sum = x8++ + y8;
		System.out.println(sum);
		
		
		
	}
	
	private static String binaryToDecimal(String decimal) {
		int ans = decimal.charAt(0) - '0';
		
		for(int i = 1; i < decimal.length(); i++) {
			char ch = decimal.charAt(i);
			int curr = ch - '0';
			ans = ans * 2 + curr;
		}
		
		return String.valueOf(ans);
	}
	
	private static void question3(int x) {
		System.out.println("x's binary string version: " + Integer.toBinaryString(x));		
		x <<= 1;
		System.out.println("decimal(left shift by 1): " + x);
		System.out.println("binary(left shift by 1): " + Integer.toBinaryString(x));
		System.out.println();
	}
	
	private static void question4(int x) {
		System.out.println("x's binary string version: " + Integer.toBinaryString(x));		
		x >>= 2;
		System.out.println("decimal(right shift by 2): " + x);
		System.out.println("binary(right shift by 2): " + Integer.toBinaryString(x));
		System.out.println();
	}
	
	private static void question5(int x, int y) {
		int z = x & y;
		System.out.println("x's binary string version:" + Integer.toBinaryString(x));
		System.out.println("y's binary string version:" + Integer.toBinaryString(y));
		System.out.println("x & y: " + z);
		System.out.println("x & y's binary string version:" + Integer.toBinaryString(z));
		
		z = x | y;
		System.out.println("x | y: " + (z));
		System.out.println("x | y's binary string version:" +Integer.toBinaryString(z));
	}
	
	private static void question6(int x) {
		System.out.println("Before the increment: " + x);
		x++;
		System.out.println("After the increment: " + x);
	}
	
}
