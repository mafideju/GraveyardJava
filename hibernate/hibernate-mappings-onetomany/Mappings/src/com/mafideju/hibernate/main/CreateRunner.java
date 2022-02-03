package com.mafideju.hibernate.main;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Course;
import com.mafideju.hibernate.entity.Instructor;
import com.mafideju.hibernate.entity.InstructorDetail;
import com.mafideju.hibernate.entity.Review;
import com.mafideju.hibernate.entity.Student;

public class CreateRunner {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try { 
			/**
			 * CREATE A INSTRUCTOR WITHIN A DETAIL
			 * 
//			session.beginTransaction();
//			
//			Instructor geraldo = new Instructor("Marcio", "Mafideju", "boss@mafideju.com");
//			InstructorDetail geraldoDetalhe = new InstructorDetail("www.youtube.com/mafideju", "Developer");
//			geraldo.setInstructorDetail(geraldoDetalhe);
//			session.save(geraldo);
//			
//			session.getTransaction().commit();
//			
//			System.out.println("CHANGE TRANSACTION");
			
			*/
			
/**
 * 
 * 
 * 			CRIAR UM CURPS ASSOCIANDO ESTUDANTES A ELE
 * 
 * 			session.beginTransaction();
			
			Course course = new Course("Porra 4576 de");
			session.save(course);
			
			// session.clear();

			System.out.println("SALVANDO CURSOS");
			
			Student marcio = new Student("Marcio", "Mafideju", "mafideju@outlook.com");
			Student beto = new Student("Roberto", "Carvalho", "beto@outlook.com");
			
			course.addStudent(marcio);
			course.addStudent(beto);
			
			System.out.println("SALVANDO ESTUDANTES");
			
			session.save(beto);
			session.save(marcio);
			
			session.getTransaction().commit();
			
			 System.out.println(course);
 */
		} catch (HibernateException e){
			System.out.println("Hibernate Exception----" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception--------------" + e.getMessage());
		} finally {
			session.close();
			factory.close();
		}

	}

}
