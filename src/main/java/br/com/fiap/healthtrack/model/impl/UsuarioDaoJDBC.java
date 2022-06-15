package br.com.fiap.healthtrack.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.healthtrack.database.DB;
import br.com.fiap.healthtrack.database.DbException;
import br.com.fiap.healthtrack.model.dao.UsuarioDao;
import br.com.fiap.healthtrack.model.entities.Usuario;

public class UsuarioDaoJDBC implements UsuarioDao {

	private Connection conn;

	public UsuarioDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public Usuario findByEmailAndPwd(String email, String pwd) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT * "
					+ "FROM tb_usuario "
					+ "where nm_email = ? and nr_senha = ?");
					
			st.setString(1, email);
			st.setString(2, pwd);
			
			rs = st.executeQuery();
			
			if (rs.next()) {
				Usuario user = instantiateUsuario(rs);
				return user;
			} 
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		} 
	}
	
	@Override
	public void insert(Usuario user) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO tb_usuario " 
					+ "(nm_usuario, nm_email, nr_senha) "
					+ "VALUES "
					+ "(?, ?, ?)", 
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, user.getNome());
			st.setString(2, user.getEmail());
			st.setString(3, user.getSenha());
										
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					user.setId(id);
				}
				DB.closeResultSet(rs);
			}
			else {
				throw new DbException("Unexpected error! No rows affected.");
			}

		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		} 
		finally {
			DB.closeStatement(st);
		}		
	}
	
	private Usuario instantiateUsuario(ResultSet rs) throws SQLException {
		Usuario user = new Usuario();
		user.setNome(rs.getString("nm_usuario"));
		user.setEmail(rs.getString("nm_email"));
		user.setSenha(rs.getString("nr_senha"));
		return user;
	}
}

