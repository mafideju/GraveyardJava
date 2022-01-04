package com.mafideju.hibernate.employee;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mafideju.hibernate.entity.Employee;

public class ReadEmployee {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			List<Employee> employee = session.createQuery("from Employee", Employee.class).getResultList();
		
			session.getTransaction().commit();
			for(Employee employ: employee) {
				System.out.println(employ);
			}
			System.out.println("CRIAÇÃO DE USUARIO REALIZADA COM SUCESSO!!");
			 
		} catch (HibernateException e){
			System.out.println("-------------HibernateException--------------" + e.getMessage());
		} catch (Exception e) {
			System.out.println("-------------Exception--------------" + e.getMessage());
		} finally {
			factory.close();
		}
		
	}
}
