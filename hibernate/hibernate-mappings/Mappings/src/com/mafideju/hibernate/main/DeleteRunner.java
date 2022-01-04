package com.mafideju.hibernate.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Instructor;
import com.mafideju.hibernate.entity.InstructorDetail;

public class DeleteRunner {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			int id = 4;
			Instructor geraldo = session.get(Instructor.class, id);
			System.out.println("DELETE " + geraldo);

			if (geraldo != null) {
				session.delete(geraldo);
			}
			
			session.getTransaction().commit();
			
			System.out.println();
			
			System.out.println("REMOÇAO DE USUARIO REALIZADA COM SUCESSO!!");
			 
		} catch (HibernateException e){
			System.out.println("-------------HibernateException--------------" + e.getMessage());
		} catch (Exception e) {
			System.out.println("-------------Exception--------------" + e.getMessage());
		} finally {
			factory.close();
		}
		
	}
}
