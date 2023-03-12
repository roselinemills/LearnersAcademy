package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Teacher;

public class TeacherDB {
	// fetch all records -> select *
	public List<Teacher> getAllTeachers() throws SQLException
	{
		List<Teacher> teachers = new ArrayList<Teacher>();

		String sql = "SELECT\r\n"
				+ "    t.teacher_id,\r\n"
				+ "    t.first_name,\r\n"
				+ "    t.last_name,\r\n"
				+ "    t.phone_number,\r\n"
				+ "    t.email,\r\n"
				+ "    c.class_name\r\n"
				+ "FROM\r\n"
				+ "    teacher t\r\n"
				+ "LEFT JOIN teacher_class tc ON\r\n"
				+ "    t.teacher_id = tc.teacher_id\r\n"
				+ "LEFT JOIN class c ON\r\n"
				+ "    tc.class_id = c.class_id";
		
		Connection conn = DBConnection.dbConn(); 
		Statement stat = conn.createStatement();
		
		ResultSet rs = stat.executeQuery(sql);
		
		while(rs.next()) {
			Teacher t1 = new Teacher();
			
			t1.setTeacher_id(rs.getInt(1));
			t1.setFirst_name(rs.getString(2));
			t1.setLast_name(rs.getString(3));
			t1.setPhone_number(rs.getString(4));
			t1.setEmail(rs.getString(5));
			t1.setClass_name(rs.getString(6));
			
			teachers.add(t1);
		}
		return teachers;
	}
	
	public boolean AssignTeacherUsingPrepareStatement(String class_id,String teacher_id) throws SQLException
	{		
		String sql = "INSERT INTO teacher_class VALUES (?, ?)";

		System.out.println(sql);
		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statement
		PreparedStatement stat = conn.prepareStatement(sql);
		stat.setString(1,class_id);
		stat.setString(2,teacher_id);
		try {
			stat.execute();
		}catch(Exception e)
		{
			System.out.println("error "+e.getMessage());
			return false;
		}
		return true;
	}

	public boolean AddTeacherUsingPrepareStatement(Teacher teacher) throws SQLException {
		String sql = "INSERT INTO teacher VALUES (?,?,?,?,?)";

		System.out.println(sql);
		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statement
		PreparedStatement stat = conn.prepareStatement(sql);
		stat.setString(1,(null));
		stat.setString(2,teacher.getFirst_name());
		stat.setString(3,teacher.getLast_name());
		stat.setString(4,teacher.getPhone_number());
		stat.setString(5,teacher.getEmail());
		
		
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
