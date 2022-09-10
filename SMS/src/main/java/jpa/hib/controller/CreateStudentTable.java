package jpa.hib.controller;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import jpa.entitymodels.Student;

public class CreateStudentTable {
	public static void main(String[] args) {
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       Session session = factory.openSession();
       Transaction t = session.beginTransaction();
       Student one = new Student();
       t.commit();
       System.out.println("successfully created student table");
       factory.close();
       session.close();
    }
}


