package com.mafideju.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		
		String JDBCURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String username = "hbstudent";
		String password = "hbstudent";
		
		try {
			
			System.out.println("Conectando do MySQL  " + JDBCURL);
			
			Connection myConn = DriverManager.getConnection(JDBCURL, username, password);
			
			System.out.println("Conexão Bem Sucedida!! Parabéns!!!!! POOOOOOOOOOOORRRRA  " + myConn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
