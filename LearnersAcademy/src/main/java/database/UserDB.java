package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDB {
	public boolean validateUser(String username, String password) throws SQLException
	{
		boolean isValid = false;
		String sql = "select password from user where username=?";
		Connection conn = DBConnection.dbConn();
		PreparedStatement stat = conn.prepareStatement(sql);
		stat.setString(1, username);
		ResultSet rs = stat.executeQuery();
		if(rs.next()) {
			String pass = rs.getString(1);
			if(pass.equals(password))
				isValid = true;
		}
		return isValid;
	}
}
