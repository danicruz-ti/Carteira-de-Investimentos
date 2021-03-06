package br.com.alura.carteira.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;

public class TransacaoDao {
	
	private Connection conexao;
		
	public TransacaoDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void cadastrar(Transacao transacao) {
		try {			
			String sql = "insert into transacoes (ticker, preco, quantidade, data, tipo) values (?, ?, ?, ?, ?)";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, transacao.getTicker());
			ps.setBigDecimal(2, transacao.getPreco());
			ps.setInt(3, transacao.getQuantidade());
			ps.setDate(4, Date.valueOf(transacao.getData()));
			ps.setString(5, transacao.getTipo().toString());
			
			ps.execute();
			ps.close();
			//System.out.println("Resultado:" +ps.executeUpdate());
			
			System.out.println("Adicionado.");
						 
		} catch (SQLException e) {
		  e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public List<Transacao> listar() {
		try {
			String sql = "select * from transacoes";
								
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			List<Transacao> transacoes = new ArrayList<>();  
			
			while(rs.next()) {
				Transacao t = new Transacao();
				
				t.setTicker(rs.getString("ticker"));
				t.setPreco(rs.getBigDecimal("preco"));
				t.setQuantidade(rs.getInt("quantidade"));
				t.setData(rs.getDate("data").toLocalDate());
				t.setTipo(TipoTransacao.valueOf(rs.getString("tipo")));
				
				transacoes.add(t);
			}
			
			rs.close();
			ps.close();
			
			return transacoes;							
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
