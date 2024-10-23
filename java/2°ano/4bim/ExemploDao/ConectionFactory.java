package DAO; //Apenas Banco de Dados

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
	
	public Connection  getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/bdExemploDao", "root", "");
		} catch(SQLException e) {
			throw new RuntimeException();
		}
	}
}
