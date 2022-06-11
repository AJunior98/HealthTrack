package br.com.fiap.healthtrack.model.dao;

import java.util.List;

import br.com.fiap.healthtrack.model.entities.Perfil;

public interface PerfilDao {

	void insert(Perfil obj);
	void update(Perfil obj);
	void deleteByCpf(String id);
	Perfil findByCpf(String cpf);
	List<Perfil> findAll();
	List<Perfil> findByDoenca(Perfil doenca);
	
}
