package com.mafideju.hibernate.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Course;
import com.mafideju.hibernate.entity.Instructor;
import com.mafideju.hibernate.entity.InstructorDetail;

public class GetInstructorCoursesRunner {
	
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

			int id = 4;
			Instructor instructor = session.get(Instructor.class, id);
			System.out.println(instructor);
			
			instructor.getCourses();
			
			System.out.println("Cursos do " + instructor.getFirstName() + ": " + instructor.getCourses());
			
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
