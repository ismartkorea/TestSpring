package kr.co.hibiznet.common;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/for_blog?useSSL=false&serverTimezone=UTC";

	private static final String USER = "tester";
	private static final String PW = "test123";
	
	@Test
	public void testConnection() throws Exception {
		
		Class.forName(DRIVER);
		
		try (Connection conn = DriverManager.getConnection
                        (URL, USER, PW)) {
			
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
