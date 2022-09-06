package valinor_viagens.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import valinor_viagens.factory.ConnectionFactory;
import valinor_viagens1.Cliente;

public class ClienteDAO {
	
	public void save(Cliente cliente) {
		String sql = "INSERT INTO cliente(nome, cpf, endereco, telefone) VALUES (?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getEndereco());
			pstm.setString(4, cliente.getTelefone());
		
			pstm.execute();				
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if (pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
				    conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
