package com.mafideju.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Employee;

public class UpdateEmployee {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();
		
		try {
			
			int id = 7;
			Employee employee = session.get(Employee.class, id);
			employee.setName("Arnaldo Tironi");
			session.getTransaction().commit();
			
		} finally {
			session.close();
		}
	}
}
