package br.com.alura.carteira.teste;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.alura.carteira.dao.TransacaoDao;
import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;

public class TesteInsereTransacao {
	
/*	public static void main(String [] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/carteira";
			String usuario = "root";
			String senha = "root";
			Connection conexao = DriverManager.getConnection(url, usuario, senha);		
			TransacaoDao dao = new TransacaoDao(conexao);
				
			Transacao transacao = new Transacao(
					"XPTO2",
					new BigDecimal("123"),
					200,
					LocalDate.now(),
					TipoTransacao.COMPRA);
			  
			dao.cadastrar(transacao);	
		} catch (Exception e) {
			System.out.println("Ocorreu um erro!");
		}
	}*/

}
