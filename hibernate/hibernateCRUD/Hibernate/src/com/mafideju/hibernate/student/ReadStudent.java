package com.mafideju.hibernate.student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Student;

public class ReadStudent {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();
		
		List<Student> students = session.createQuery("from Student", Student.class).getResultList();
//		List<Student> students = session.createQuery("FROM Student s WHERE s.firstName = 'Charles'", Student.class).getResultList();
//		List<Student> students = session.createQuery("FROM Student s WHERE s.id > 5", Student.class).getResultList();
//		List<Student> students = session.createQuery("FROM Student s WHERE s.email LIKE '%catmail.com'", Student.class).getResultList();
		
		
		session.getTransaction().commit();
		
		for(Student student: students) {
			System.out.println(student);
		}
	}

}