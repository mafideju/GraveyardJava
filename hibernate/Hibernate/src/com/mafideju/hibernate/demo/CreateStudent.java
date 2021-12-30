package com.mafideju.hibernate.demo;

import java.util.ArrayList;
import java.util.List;

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
			
			//Student student = new Student("Antony", "Davis", "tomy@davis.com");
			//Student student1 = new Student("Bonita", "Apple", "bonita@appllebounm.com");
			// List<Student> list = new ArrayList<>();
			
//			for (Student stud: students) {
//				list.add(stud);
//			}
			
			session.beginTransaction();
			//session.save(student);
			//session.save(student1);
			//session.save(student2);
			session.getTransaction().commit();
			System.out.println("OPERAÇÃO REALIZADA COM SUCESSO!!");
			 
		} catch (HibernateException e){
			System.out.println("-------------HibernateException NÃO REALIZADA --------------" + e.getMessage());
		} catch (Exception e) {
			System.out.println("-------------Exception NÃO REALIZADA --------------" + e.getMessage());
		} finally {
			factory.close();
		}
	}

}

// org.hibernate.Version logVersion Hibernate Core {5.2.18.Final} org.hibernate.cfg.Environment <clinit> hibernate.properties not found
