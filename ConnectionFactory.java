package br.com.alura.carteira.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import br.com.alura.carteira.dao.TransacaoDao;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			
			//&useSSL=true&verifyServerCertificate=false
			//&useSSL=false
			
			String url = "jdbc:mysql://localhost:3306/carteira?useTimezone=true&serverTimezone=UTC&useSSL=false";
			String usuario = "root";
			String senha = "root";
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexao = DriverManager.getConnection(url, usuario, senha);		
			return conexao;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
 