package com.mafideju.hibernate.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Course;
import com.mafideju.hibernate.entity.Instructor;
import com.mafideju.hibernate.entity.InstructorDetail;
import com.mafideju.hibernate.entity.Review;

public class GetInstructorCoursesRunner {
	
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();

			int id = 34;
			Course course = session.get(Course.class, id);
			
			System.out.println(course);
			System.out.println(course.getReviews());
			
			/**
			 * @author marciomafidejurodrigues 
			 * DELETAR UM CURSO
			 * 
			 * session.delete(course);
			 */
			
			// session.delete(course);
			
			session.getTransaction().commit();
			
			System.out.println("USUARIO CONSULTADO COM SUCESSO!!");
			 
		} catch (HibernateException e){
			e.printStackTrace();
			System.out.println("-------------HibernateException--------------" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("-------------Exception--------------" + e.getMessage());
		} finally {
			session.close();
			factory.close();
		}
	}
}
