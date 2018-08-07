package Ajinkya.Framework;

import java.sql.*;

public class DBUtils {
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	public ResultSet connectDB(String SQLstmt) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;instance=SQLEXPRESS;databaseName=AldiPop", "ajinkya", "abc@123");
		stmt = conn.createStatement();
		rs = stmt.executeQuery(SQLstmt);
		return rs;
	}

}
