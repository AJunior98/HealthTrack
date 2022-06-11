package br.com.fiap.healthtrack.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.healthtrack.database.DB;
import br.com.fiap.healthtrack.database.DbException;
import br.com.fiap.healthtrack.model.dao.ExercicioDao;
import br.com.fiap.healthtrack.model.entities.Exercicios;

public class ExerciciosDaoJDBC implements ExercicioDao {
	
private Connection conn;
	
	public ExerciciosDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void deleteById(Integer id) {
	PreparedStatement st = null;
	try {
		st = conn.prepareStatement("DELETE FROM tb_exercicios WHERE id = ?");
		
		st.setInt(1, id);
		
		st.executeUpdate();
	}
	catch (SQLException e) {
		throw new DbException(e.getMessage());
	}
	finally {
		DB.closeStatement(st);
	}
}

	@Override
	public void update(Exercicios obj) {
		
	}
	
}
