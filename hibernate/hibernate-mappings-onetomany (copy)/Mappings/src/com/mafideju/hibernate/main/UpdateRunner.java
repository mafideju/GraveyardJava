package com.mafideju.hibernate.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Course;
import com.mafideju.hibernate.entity.Instructor;
import com.mafideju.hibernate.entity.InstructorDetail;

public class UpdateRunner {
	

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

			int id = 3;
			Instructor instructor = session.get(Instructor.class, id);
			System.out.println(instructor);
			
			Course course = new Course("Angular Crash Courses");
			Course course1 = new Course("Kotlin Crash Courses");
			Course course2 = new Course("Android Native Crash Courses");
			
			instructor.add(course);
			instructor.add(course1);
			instructor.add(course2);
			
			session.save(course);
			session.save(course1);
			session.save(course2);
			
			session.getTransaction().commit();
			
			System.out.println("USUARIO ATUALIZADO COM SUCESSO!!");
			
			System.out.println("SAVED ID " + course.getTitle());
			 
		} catch (HibernateException e){
			System.out.println("-------------HibernateException--------------" + e.getMessage());
		} catch (Exception e) {
			System.out.println("-------------Exception--------------" + e.getMessage());
		} finally {
			session.close();
			factory.close();
		}

	}

}
