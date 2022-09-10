package jpa.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Course;


public class CreateCourseTable {
	public static void main(String[] args) {
	       SessionFactory factory = new Configuration().configure().buildSessionFactory();
	       Session session = factory.openSession();
	       Transaction t = session.beginTransaction();
	       Course one = new Course();
	       t.commit();
	       System.out.println("successfully created course table");
	       factory.close();
	       session.close();
    }
}
