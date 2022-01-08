package com.mafideju.hibernate.main;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Course;
import com.mafideju.hibernate.entity.Instructor;
import com.mafideju.hibernate.entity.InstructorDetail;

public class CreateRunner {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			Instructor geraldo = new Instructor("Marcio", "Mafideju", "boss@mafideju.com");
			InstructorDetail geraldoDetalhe = new InstructorDetail("www.youtube.com/mafideju", "Developer");
			geraldo.setInstructorDetail(geraldoDetalhe);
			
			session.beginTransaction();

			session.save(geraldo);
			
			session.getTransaction().commit();
			
			System.out.println(geraldo);
			
			System.out.println("CRIAÇÃO DE USUARIO REALIZADA COM SUCESSO!!");
			
			System.out.println("SAVED ID " + geraldo.getId());
			 
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
