package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MYSQLConnectionTest {
	private static final String driver= "com.mysql.cj.jdbc.Driver";
	Connection con;
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(driver);
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/book_ex",
					"root",
					"zerock");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
