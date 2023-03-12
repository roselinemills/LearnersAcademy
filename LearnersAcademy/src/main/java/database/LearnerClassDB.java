package database;

//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.LearnerClass;

public class LearnerClassDB {
	public List<LearnerClass> getAllClasses() throws SQLException
	{
		List<LearnerClass> classes = new ArrayList<LearnerClass>();

		String sql = "SELECT\r\n"
				+ "    c.class_id,\r\n"
				+ "    c.class_name,\r\n"
				+ "    c.class_description,\r\n"
				+ "    s.subject_name\r\n"
				+ "FROM\r\n"
				+ "    class c\r\n"
				+ "LEFT JOIN class_subject cs ON\r\n"
				+ "    cs.class_id = c.class_id\r\n"
				+ "LEFT JOIN SUBJECT s ON\r\n"
				+ "    s.subject_id = cs.subject_id";
		
		Connection conn = DBConnection.dbConn();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		
		  while(rs.next()) { LearnerClass c1 = new LearnerClass();
		  c1.setClass_id(rs.getInt(1));
		  c1.setClass_name(rs.getString(2));
		  c1.setClass_description(rs.getString(3));
		  c1.setSubject_name(rs.getString(4));
		  
		  classes.add(c1); }
		return classes;
	
	}

	public boolean AddClassUsingPrepareStatement(LearnerClass learnerclass) throws SQLException {
		String sql = "INSERT INTO class VALUES (?,?,?)";

		System.out.println(sql);
		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statement
		PreparedStatement stat = conn.prepareStatement(sql);
		stat.setString(1,(null));
		stat.setString(2,learnerclass.getClass_name());
		stat.setString(3,learnerclass.getClass_description());
		
		try {
			stat.execute();
		}catch(Exception e)
		{
			System.out.println("error "+e.getMessage());
			return false;
		}
		
		return true;
	}

	public boolean AssignClassUsingPrepareStatement(LearnerClass learnerclass) throws SQLException {
		
		String sql = "INSERT INTO class_subject VALUES (?,?)";
		
		Connection conn = DBConnection.dbConn();
		PreparedStatement stat = conn.prepareStatement(sql);
		
		stat.setInt(1,learnerclass.getClass_id());
		stat.setInt(2,learnerclass.getSubject_id());
		  
		  try {
				stat.execute();
			}catch(Exception e)
			{
				System.out.println("error "+e.getMessage());
				return false;
			}
			
			return true;
	}
}
