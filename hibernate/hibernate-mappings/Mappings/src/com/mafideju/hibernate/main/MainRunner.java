package com.mafideju.hibernate.main;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Instructor;
import com.mafideju.hibernate.entity.InstructorDetail;

public class MainRunner {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			Instructor geraldo = new Instructor("Antonio", "Gagfundes", "tnoio@boigordo.com");
			InstructorDetail geraldoDetalhe = new InstructorDetail("www.youtube.com/boigordo", "Ator");
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
			factory.close();
		}
		
	}

}
