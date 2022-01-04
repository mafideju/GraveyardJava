package com.mafideju.hibernate.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Instructor;
import com.mafideju.hibernate.entity.InstructorDetail;

public class BiOneRunner {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			Instructor geraldo = new Instructor("Marcio", "Rodrigs", "mafideju@outlook.com");
			InstructorDetail geraldoDetalhe = new InstructorDetail("www.youtube.com/mafideju", "Javeiro");
			// geraldo.setInstructorDetail(geraldoDetalhe);
			geraldoDetalhe.setInstructor(geraldo);
			
			session.beginTransaction();

			session.save(geraldoDetalhe);
			
			session.getTransaction().commit();
			
			System.out.println(geraldoDetalhe);
			
			System.out.println("CRIAÇÃO DE USUARIO REALIZADA COM SUCESSO!!");
			
			System.out.println("SAVED ID " + geraldo.getId());
			 
		} catch (HibernateException e){
			e.printStackTrace();
			System.out.println("..HibernateException--------------" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("..Exception--------------" + e.getMessage());
		} finally {
			factory.close();
		}
		
	}
}
