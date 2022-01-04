package com.mafideju.hibernate.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Student;

public class DeleteStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();
		
		try {
			
			deleteStudent(session);
			
		} finally {
			session.close();
		}
		
	}

	static void deleteStudent(Session session) {
	
		int id = 8;
		Student student = session.get(Student.class, id);
		System.out.println("O estudante " + student + " está sendo deletado.");
//		session.delete(student);
		session
		.createQuery("DELETE FROM Student WHERE id="+id)
		.executeUpdate();
		session.getTransaction().commit();
		
	}

}
