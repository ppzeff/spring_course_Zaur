package com.ppzeff.hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tets1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Aleksander", "Ivanov", "IT", 800);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            System.out.println(employee);
            System.out.println("Done!!!");
        }
        finally {
            factory.close();
        }
    }
}
