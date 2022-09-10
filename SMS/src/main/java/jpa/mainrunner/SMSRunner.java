package jpa.mainrunner;

import java.sql.SQLException;
import java.util.Scanner;

import jpa.service.StudentService;

public class SMSRunner {
	public static void main(String[] args) throws SQLException {
		StudentService studentService = new StudentService();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Are you a(n): 1.Student, 2.Quit\r\n"
				+ "Please enter 1 or 2.");
		Integer number = input.nextInt();
		if (number == 1) {
			System.out.println("Enter Your Email:");
			String sEmail = input.nextLine();
			System.out.println("Enter Your Password:");
			String sPass = input.nextLine();
			
			boolean loginTrue = studentService.validateStudent(sEmail, sPass);
		}
		
	}
}
