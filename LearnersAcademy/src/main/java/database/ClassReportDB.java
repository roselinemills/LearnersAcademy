package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.ClassReport;

public class ClassReportDB {
	public List<ClassReport> getClassReport() throws SQLException
	{
		List<ClassReport> classreports = new ArrayList<ClassReport>();
		String sql = "SELECT\r\n"
				+ "    c.class_id,\r\n"
				+ "    c.class_name,\r\n"
				+ "    c.class_description,\r\n"
				+ "    su.subject_name,\r\n"
				+ "    t.first_name,\r\n"
				+ "    t.last_name,\r\n"
				+ "    s.first_name,\r\n"
				+ "    s.last_name\r\n"
				+ "FROM\r\n"
				+ "    class c\r\n"
				+ "LEFT JOIN CLASS_SUBJECT cs ON\r\n"
				+ "    c.class_id = cs.class_id\r\n"
				+ "LEFT JOIN subject su ON\r\n"
				+"     cs.subject_id = su.subject_id\r\n"
				+ "LEFT JOIN teacher_class tc ON\r\n"
				+ "    c.class_id = tc.class_id\r\n"
				+ "LEFT JOIN teacher t ON\r\n"
				+ "    tc.teacher_id = t.teacher_id\r\n"
				+ "LEFT JOIN student_class SC ON\r\n"
				+ "    c.class_id = sc.class_id\r\n"
				+ "LEFT JOIN student s ON\r\n"
				+ "    s.student_id = sc.student_id order by c.class_id";	
		Connection conn = DBConnection.dbConn();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()) {
			ClassReport c1 = new ClassReport();
			c1.setClass_id(rs.getInt(1));
			c1.setClass_name(rs.getString(2));
			c1.setClass_description(rs.getString(3));
			c1.setSubject_name(rs.getString(4));
			c1.setTeacher_fname(rs.getString(5));
			c1.setTeacher_lname(rs.getString(6));
			c1.setStudent_fname(rs.getString(7));
			c1.setStudent_lname(rs.getString(8));
			classreports.add(c1);
		}
		return classreports;}
}
