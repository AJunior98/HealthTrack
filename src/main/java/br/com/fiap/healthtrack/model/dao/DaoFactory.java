package br.com.fiap.healthtrack.model.dao;

import br.com.fiap.healthtrack.database.DB;
import br.com.fiap.healthtrack.model.impl.UsuarioDaoJDBC;

public class DaoFactory {
		
	public static UsuarioDao createUsuarioDao() {
		return new UsuarioDaoJDBC(DB.getConnection());
	}
		
}
	

