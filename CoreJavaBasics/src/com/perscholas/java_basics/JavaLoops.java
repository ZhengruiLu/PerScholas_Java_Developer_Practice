package com.perscholas.java_basics;

import java.util.ArrayList;
import java.util.List;

public class JavaLoops {
	public static void main(String[] args) {
		//1.
//		q1(1, 10);
		
		//2.
//		q2(0, 100);
		
		//3.
//		q3(1, 10);
		
		//4.
//		q4(1, 100);
		
		//5.
//		q5(1, 100);
		
		//6.
//		q6(2, 5);
		
		//7.
//		q7(10, 200);
		
		//8.
//		q8fibonacci(50);
		
		//9.
		q9NestedLoop();
		
		
	}
	
	public static int minimumSteps(List<String> loggedMoves) {
    // Write your code here
        int cnt = 0;
        
        for (int i = 0; i < loggedMoves.size(); i++){
            String str = loggedMoves.get(i);
            
            if (str == "../"){
                cnt--;
            }else if (str == "./"){
                continue;
            }else{
                cnt++;
            }
        }
        
        return cnt;
    }
	
	private static void q1(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}
	
	private static void q2(int start, int end) {
		while (start <= end) {
			System.out.println(start);
			start += 10;
		}
	}
	
	private static void q3(int start, int end) {		
		do {
			System.out.println(start);
			start++;
		}
		while (start <= end);
	}
	
	private static void q4(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 5 == 0) {
				if (i < 25 || i > 75) {
					System.out.println(i);
				}else {
					continue;
				}
			}
				
		}
	}
	
	private static void q5(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 5 == 0) {
				if (i > 50) {
					break;
				}else {
					System.out.println(i);
				}	
			}
				
		}
	}
	
	private static void q6(int week, int day) {
		for (int i = 1; i <= week; i++) {
			System.out.println("Week " + i + ":");
			for (int j = 1; j <= day; j++) {
				System.out.println("Day " + j + ":");
			}			
		}
	}
	
	private static void q7(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPalindrome(i)) {
				System.out.print(i + ", ");
			}
		}
	}
	
	private static boolean isPalindrome(int num) {
		String str = String.valueOf(num);
		int start = 0, end = str.length() - 1;
		
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
	
	private static void q8fibonacci(int range) {		
		int[] dp = new int[range];
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i < range; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
			if (dp[i] <= range && dp[i] >= 0) {
				System.out.print(dp[i] + ", ");
			}
		}
	}
	
	private static void q9NestedLoop() {		
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 6; j <= 10; j++) {
				System.out.println("Inner loop: i: " + i + ", j: " + j);
			}
		}
	}
	
}
