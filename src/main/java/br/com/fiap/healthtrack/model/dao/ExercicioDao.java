package br.com.fiap.healthtrack.model.dao;

import br.com.fiap.healthtrack.model.entities.Exercicios;

public interface ExercicioDao {
	
	void deleteById(Integer id);
	void update(Exercicios obj);
	
}
