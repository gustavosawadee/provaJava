package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	private static String connUrl="jdbc:mysql://127.0.0.1:3306/provajava";
	private static String connDriver="org.gjt.mm.mysql.Driver";
	private static String userName="root";
	private static String userPass="";
	
	private static Connection conn;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(conn!=null) {
			return conn;
		}
		else {
			Class.forName(connDriver);
			return DriverManager.getConnection(connUrl, userName, userPass);
		}		
	}
}
