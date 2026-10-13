package biblioteque;

import entity.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


public class MyConnection {
	private String url;
	private String user;
	private String password;
	
	public MyConnection(String url, String user, String password) {
		this.password = url;
		this.password = user;
		this.password = password;
	}
	
	
	public  MyConnection() {
		 url = "jdbc:mysql://localhost:3306/db_livre";
		 user = "admbiblio";
		 password = "P@ssw0rd";
	}	
		 
	public Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connexion réussie !");
			return connection;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}