package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
			public static Connection dbConn()
		{
			Connection conn = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learners","root", "");
				
				System.out.println("DB conected");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
}
