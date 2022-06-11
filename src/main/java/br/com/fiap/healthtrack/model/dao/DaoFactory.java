package br.com.fiap.healthtrack.model.dao;

import br.com.fiap.healthtrack.database.DB;
import br.com.fiap.healthtrack.model.impl.PerfilDaoJDBC;
import br.com.fiap.healthtrack.model.impl.UsuarioDaoJDBC;

public class DaoFactory {
		
	public static PerfilDao createPessoaDao() {
		return new PerfilDaoJDBC(DB.getConnection());
	}
		
	public static UsuarioDao createUsuarioDao() {
		return new UsuarioDaoJDBC(DB.getConnection());
	}
		
}
	

