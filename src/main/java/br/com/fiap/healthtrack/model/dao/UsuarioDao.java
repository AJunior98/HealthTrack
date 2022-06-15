package br.com.fiap.healthtrack.model.dao;

import br.com.fiap.healthtrack.model.entities.Usuario;

public interface UsuarioDao {

	Usuario findByEmailAndPwd(String email, String pwd);
	void insert(Usuario user);

}	
