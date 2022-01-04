package com.mafideju.hibernate.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();
		
		try {
			
			int id = 1;
			Student student = session.get(Student.class, id);
			student.setEmail("gatapreta@catmail.com");
			session.getTransaction().commit();
			
		} finally {
			session.close();
		}
		
	}

}
