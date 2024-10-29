package DAO; //Apenas Banco de Dados
// DAO = Objeto de Acesso a Dados
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
	
	public Connection  getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/bdloja", "root", "");
		} catch(SQLException e) {
		    throw new RuntimeException("Erro ao conectar ao banco de dados", e);
		}
	}
}
