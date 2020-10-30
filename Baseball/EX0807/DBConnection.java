package EX0807;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection makeConnection() {
		// Connection Ÿ���� con ����
		Connection con = null;
		String user = "JDBC0807"; // ������ DB ����
		String password = "1234"; // ������ ������ ���
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB ���� ����"+"\n");
			
		} catch (ClassNotFoundException e) {
			System.out.println("DB ����̹� �ε� ���� "+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ���� "+e.toString());
			e.printStackTrace();
		}
  	    return con;
	}

}
