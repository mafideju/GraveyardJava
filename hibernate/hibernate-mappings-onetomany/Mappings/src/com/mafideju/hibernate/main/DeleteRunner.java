package com.mafideju.hibernate.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Course;
import com.mafideju.hibernate.entity.Instructor;
import com.mafideju.hibernate.entity.InstructorDetail;

public class DeleteRunner {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();

			int id = 18;
			Course course = session.get(Course.class, id);
			System.out.println(course);
			
			session.delete(course);
			
			session.getTransaction().commit();
			
			System.out.println("CURSO DELETADO COM SUCESSO!!");
			 
		} catch (HibernateException e){
			System.out.println("---Hibernate Exception--------------" + e.getMessage());
		} catch (Exception e) {
			System.out.println("-------------Exception--------------" + e.getMessage());
		} finally {
			session.close();
			factory.close();
		}

	}
}
