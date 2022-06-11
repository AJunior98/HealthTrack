package br.com.fiap.healthtrack.model.dao;

import java.util.List;

import br.com.fiap.healthtrack.model.entities.Usuario;

public interface UsuarioDao {

	void insert(Usuario obj);
	void update(Usuario obj);
	void deleteById(Integer id);
	Usuario findByEmailAndPwd(String email, String pwd);
	List<Usuario> findAll();
	
}	
