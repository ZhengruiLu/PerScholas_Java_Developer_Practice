package com.perscholas.java_basics;

import java.util.Arrays;

public class JavaArrays {
	public static void main(String[] args) {
//		q1(3);
		
//		int[] q2 = {13, 5, 7, 68, 2};
//		q2(q2);
		
//		q3();
		
//		q4();
		
//		q5();
		
//		q6();
		
//		q7();
		
//		q8();
		
//		q9();
		
		q10();
		
		
	}
	
	private static void q1(int length) {
		int[] arr = new int[length];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static void q2(int[] arr) {
		System.out.println(arr[arr.length / 2]);
	}
	
	private static void q3() {
		String[] arr = {"red", "green", "blue", "yellow"};
		System.out.println("arr.length" + arr.length);
		
		String[] copy = arr.clone();
		System.out.println("Original arr: " + Arrays.toString(arr));
		System.out.println("Copy arr: " + Arrays.toString(copy));
		
		arr[0] = "changed";
		copy[3] = "fixed";
		System.out.println("Changed original arr: " + Arrays.toString(arr));
		System.out.println("Changed original arr: " + Arrays.toString(copy));
	}
	
	private static void q4() {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);
		System.out.println(arr[arr.length]);
		System.out.println(arr[5]);	
	}
	
	private static void q5() {
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = i;			
			System.out.println("Index: " + i + " | value: " + arr[i]);
		}
	}
	
	private static void q6() {
		int[] arr = new int[5];
		arr[0] = 1;
		System.out.println("Index: " + 0 + " | value: " + arr[0]);
		
		for (int i = 1; i < 5; i++) {
			arr[i] = arr[i - 1] * 2;			
			System.out.println("Index: " + i + " | value: " + arr[i]);
		}
	}
	
	private static void q7() {
		int[] arr = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < 5; i++) {
			if (i != 2)	
				System.out.println("Index: " + i + " | value: " + arr[i]);
		}
	}
	
	private static void q8() {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		
		int temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static void q9() {
		int[] arr = {4, 2, 9, 13, 1, 0};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

//		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//			
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
		
		System.out.println("Max Value: " + arr[0]);
		System.out.println("Min Value: " + arr[arr.length - 1]);
	}
	
	private static void q10() {
		Object[] arr = new Object[5];
		
		arr[0] = 13;
		arr[1] = "US";
		arr[2] = "Seattle Middle School";
		arr[3] = "Terry Ave";
		arr[4] = 89.7;
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
}
