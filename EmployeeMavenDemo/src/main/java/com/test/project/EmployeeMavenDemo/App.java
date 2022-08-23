package com.test.project.EmployeeMavenDemo;

import com.perscholas.controller.EmployeController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeController e = new EmployeController();
//        e.createEmployeeTable();
//        e.findEmployeeByname();
//        e.findEmployeeById();
        e.ShowOfficeCodes_AsDepartment();
    }
}
