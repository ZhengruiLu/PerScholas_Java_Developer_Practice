package com.test.hib.controller;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.User;


public class CreateUserTable {
   public static void main(String[] args) {
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       Session session = factory.openSession();
       Transaction t = session.beginTransaction();
       User uone = new User();
       t.commit();
       System.out.println("successfully created user table");
       factory.close();
       session.close();
   }
}