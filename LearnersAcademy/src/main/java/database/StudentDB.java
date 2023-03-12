package database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class StudentDB {
	public List<Student> getAllStudents() throws SQLException
	{
		List<Student> students = new ArrayList<Student>();
		String sql = "SELECT\r\n"
				+ "    s.student_id,\r\n"
				+ "    s.first_name,\r\n"
				+ "    s.last_name,\r\n"
				+ "    s.phone_number,\r\n"
				+ "    s.email,\r\n"
				+ "    c.class_name\r\n"
				+ "FROM\r\n"
				+ "    student s\r\n"
				+ "LEFT JOIN student_class sc ON\r\n"
				+ "    s.student_id = sc.student_id\r\n"
				+ "LEFT JOIN class c ON\r\n"
				+ "    c.class_id = sc.class_id";
		
		Connection conn = DBConnection.dbConn();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()) {
			Student s1 = new Student();
			s1.setStudent_id(rs.getInt(1));
			s1.setFirst_name(rs.getString(2));
			s1.setLast_name(rs.getString(3));
			s1.setPhone_number(rs.getString(4));
			s1.setEmail(rs.getString(5));
			s1.setLearner_class(rs.getString(6));			
			students.add(s1);
		}
		return students;
	}}
