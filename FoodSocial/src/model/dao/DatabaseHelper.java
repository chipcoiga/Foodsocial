package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {

	private static Connection connection;
	private static DatabaseHelper instance;

	public DatabaseHelper() {
		instance = this;
	}

	public void init() throws ClassNotFoundException, SQLException {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String url = "jdbc:odbc:FoodSocial";
		connection = DriverManager.getConnection(url);
	}

	public static DatabaseHelper getInstance() {
		if (instance == null)
			return new DatabaseHelper();
		return instance;
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public static void main(String args[]) {
		try {
			DatabaseHelper.getInstance().init();
			System.out.println("Success connect");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed connect");
		}
	}
}
