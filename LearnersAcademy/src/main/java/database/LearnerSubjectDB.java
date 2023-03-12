package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.LearnerSubject;

public class LearnerSubjectDB {
	public List<LearnerSubject> getAllSubjects() throws SQLException
	{
		List<LearnerSubject> subjects = new ArrayList<LearnerSubject>();

		String sql = "SELECT\r\n"
				+ "    s.subject_id,\r\n"
				+ "    s.subject_name,\r\n"
				+ "    c.class_name\r\n"
				+ "FROM SUBJECT\r\n"
				+ "    s\r\n"
				+ "LEFT JOIN class_subject cs ON\r\n"
				+ "    s.subject_id = cs.subject_id\r\n"
				+ "LEFT JOIN class c ON\r\n"
				+ "    cs.class_id = c.class_id;";
		
		Connection conn = DBConnection.dbConn();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()) {
			LearnerSubject s2 = new LearnerSubject();
			s2.setSubject_id(rs.getInt(1));
			s2.setSubject_name(rs.getString(2));
			s2.setClass_name(rs.getString(3));
			
			subjects.add(s2);
		}
		return subjects;
	}
	
	public boolean AddSubjectUsingPrepareStatement(LearnerSubject s) throws SQLException {
		String sql = "INSERT INTO subject VALUES (?,?)";

		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statement
		PreparedStatement stat = conn.prepareStatement(sql);
		stat.setString(1,(null));
		stat.setString(2,s.getSubject_name());
		
		
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
