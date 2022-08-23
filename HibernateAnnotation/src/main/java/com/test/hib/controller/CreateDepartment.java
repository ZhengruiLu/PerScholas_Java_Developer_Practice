package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.Department;

public class CreateDepartment {
   public static void main(String[] args) {
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       Session session = factory.openSession();
       Transaction t = session.beginTransaction();
       Department dept = new Department();
       
       dept.setName("HR");
       dept.setState("Georgia");
       
       t.commit();
       System.out.println("successfully created user table");
       factory.close();
       session.close();
   }
}
