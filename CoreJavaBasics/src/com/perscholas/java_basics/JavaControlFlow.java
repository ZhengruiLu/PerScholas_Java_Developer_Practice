package com.perscholas.java_basics;

import java.util.Scanner;

public class JavaControlFlow {
	public static void main(String[] args) {
		//q1
//		q1(7);
//		q1(15);
		
		//q2
//		q2(7);
//		q2(15);
		
		//q3
//		q3(15);
//		q3(50);
		
		//q4
//		q4(15);
//		q4(5);
		
		//q5
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter score: ");
//		int score = sc.nextInt();
//		q5(score);
//		sc.close();
		
		//q6
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Enter number from the range number >= 1 and number <= 7: ");
		int day = sc6.nextInt();
		q6(day);
	}
	
	private static void q1(int x) {
		if (x < 10) {
			System.out.println("Less than 10");
		}
	}
	
	private static void q2(int x) {
		if (x < 10) {
			System.out.println("Less than 10");
		}else if (x > 10) {
			System.out.println("Greater than 10");
		}
	}
	
	private static void q3(int x) {
		if (x < 10) {
			System.out.println("Less than 10");
		}else if (x >= 10 && x < 20) {
			System.out.println("Between 10 and 20");
		}else if (x >= 20) {
			System.out.println("Greater than or equal to 20");
		}
	}
	
	private static void q4(int x) {
		if (x < 10 || x > 20) {
			System.out.println("Out of range");
		}else if (x >= 10 && x < 20) {
			System.out.println("In range");
		}
	}
	
	private static void q5(int x) {
		if (x >= 90 && x <= 100) {
			System.out.println("A");
		}else if (x >= 80 && x <= 89) {
			System.out.println("B");
		}else if (x >= 70 && x <= 79) {
			System.out.println("C");
		}else if (x >= 60 && x <= 69) {
			System.out.println("D");
		}else if (x < 60) {
			System.out.println("F");
		}else if (x < 0 || x > 100) {
			System.out.println("Score out of range.");
		}
	}
	
	private static void q6(int day) {
		switch (day){
			case 1:
				System.out.println("Mon"); break;
			case 2:
				System.out.println("Tue"); break;
			case 3:
				System.out.println("Wed"); break;
			case 4:
				System.out.println("Thur"); break;
			case 5:
				System.out.println("Fri"); break;
			case 6:
				System.out.println("Sat"); break;
			case 7:
				System.out.println("Sun"); break;
			default:
				System.out.println("Out of range");
		}
	}
	
	
}
