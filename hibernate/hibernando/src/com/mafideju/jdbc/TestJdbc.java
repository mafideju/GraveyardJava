package com.mafideju.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String password = "hbstudent";

		try {
			
			System.out.println("Conectando na base de dados" + jdbcUrl);
			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
 			
			System.out.println("connection successfull --- =)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
