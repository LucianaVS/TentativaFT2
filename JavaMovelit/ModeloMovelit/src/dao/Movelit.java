package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;

public class MeiosTiposDAO {
	
	//create
	public void save(MeiosTipos meiostipos) {
		
		//creat
		String sql = "INSERT INTO MeiosTipos (nome_tipos) VALUES (?)";
		
		//fazer a conexão
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL ();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, meios.getNome_meio());
			
			pstm.executeUpdate();
		}
			
		} catch (Exception e){
			e.printStackTrace ();
	} finaly {
		//fecha as conexões
		try {
			Object pstm;
			if (pstm != null)	{
				pstm.close ();
			}
			Object conn;
			if (conn != null) {
				conn.close ();{
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace ();
		}
	}

}

//READ
public List<MeiosTipos> getMeiosTipos () {
	
	//Criar a query
	String sql = "SELECT *  FROM MeiosTipos";
	
	//faz a lista que recebe os dados dos meios
	List<MeiosTipos> meios = new ArrayList<Meios>();
	
	
	Connection conn = null
			PreparedStatement pstm = null;
	
	//classe que vai recuperar os dados do banco
	ResultSet rset = null;
	
	try {
		
		//executa a conexão com o banco
		conn = ConnectionMySQL.createConnerctionMySQL();
		
		//executa a query
		pstm = conn.prepareStatement(sql);
		
		//captura o que foi executado no pstm
		rset = pstm.executeQuery();
		
		wile (rset.next()) {
			meios.setId_meios(rset.getInt("id_meios"));
			meios.setNome_meios(rset.getString("nome_meios"));
			
			meios.add(meios);
		}
				
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (rset != null) {
				rset.close();
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null)
					conn.close();
			}
	} catch (Execption e) {
		e.printStackTrace();
}
	}
	return meios;
}

//UPPDATE
public <meios> void update(meios meio) {
	String sql = "UPDATE MEIOS SET nome_meio = ? WHERE id_meio = ?";
	
	Connection conn = null;
	PreparedStament pstm = null;
	
	try {
		conn = ConnectionMySQL.createConnectionMySQL();
		
		pstm = conn.prepareStatement(sql);
		
		// adiciona o valor nos parametros
		pstm.setString(1, meio.getNome_meio());
		pstm.setInt(2, meio.getId_meio());
		
		pstm.execute();
		
	} catch (Exeption e) {
		e.printStackTrace();
	} finally {
		try {
			
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null)
					conn.close();
			}
	} catch (Execption e) {
		e.printStackTrace();
}
	}
	}
	
	//DELETE
	public void deleteById(int id) {
		
		string sql = "DELETE FROM Meios WHERE id_meio = ?"
				
				Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		try {
			
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null)
					conn.close();
				
			} cath (Exception e) {}
			e.printStackTrace();
	}
}
