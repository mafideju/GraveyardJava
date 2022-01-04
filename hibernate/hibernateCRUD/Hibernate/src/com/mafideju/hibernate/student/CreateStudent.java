package com.mafideju.hibernate.student;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Student;

public class CreateStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			/* 
			 * CREATE STUDENT
			 * Student student = new Student("Miles", "Davis", "miles@trumpet.com");
			 * session.save(student);
			 */
			
			Student student = new Student("Charles", "Mingus", "charles@bass.com");
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
			System.out.println(student);
			System.out.println("CRIAÇÃO DE USUARIO REALIZADA COM SUCESSO!!");
			
			System.out.println("SAVED ID " + student.getId());
			
//			session = factory.getCurrentSession();
//			session.beginTransaction();
//			System.out.println("----> ID " + student.getId());
//			Student readStudent = session.get(Student.class, 5);
//			System.out.println("OPERAÇÃO FINALIZADA " + readStudent);
//			session.getTransaction().commit();
			 
		} catch (HibernateException e){
			System.out.println("-------------HibernateException--------------" + e.getMessage());
		} catch (Exception e) {
			System.out.println("-------------Exception--------------" + e.getMessage());
		} finally {
			factory.close();
		}
	}

}

// org.hibernate.Version logVersion Hibernate Core {5.2.18.Final} org.hibernate.cfg.Environment <clinit> hibernate.properties not found
