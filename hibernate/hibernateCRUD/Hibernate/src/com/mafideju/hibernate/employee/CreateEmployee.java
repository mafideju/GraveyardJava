package com.mafideju.hibernate.employee;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Employee;

public class CreateEmployee {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			Employee employed = new Employee("Mauro Cezar", 62, "Uol Esportes", "Comentarista");

			session.save(employed);
			session.getTransaction().commit();
			System.out.println(employed);
			System.out.println("CRIAÇÃO DE USUARIO REALIZADA COM SUCESSO!!");
			
			System.out.println("SAVED ID " + employed.getId());
			 
		} catch (HibernateException e){
			System.out.println("-------------HibernateException--------------" + e.getMessage());
		} catch (Exception e) {
			System.out.println("-------------Exception--------------" + e.getMessage());
		} finally {
			factory.close();
		}
		
	}
}
