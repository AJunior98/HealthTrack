package br.com.fiap.healthtrack.model.entities;

import java.util.Date;
import java.util.Objects;

public class Exercicios {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String exercicio;
	private Date realizacao;
	private Date duracao;
	private Double calorias;
	private String observacao;
	
	public Exercicios() {
	}

	public Exercicios(Integer id, String exercicio, Date realizacao, Date duracao, Double calorias, String observacao) {
		this.id = id;
		this.exercicio = exercicio;
		this.realizacao = realizacao;
		this.duracao = duracao;
		this.calorias = calorias;
		this.observacao = observacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getExercicio() {
		return exercicio;
	}

	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}

	public Date getRealizacao() {
		return realizacao;
	}

	public void setRealizacao(Date realizacao) {
		this.realizacao = realizacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public Date getDuracao() {
		return duracao;
	}

	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}

	public Double getCalorias() {
		return calorias;
	}

	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercicios other = (Exercicios) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Exercicios [id=" + id + ", exercicio=" + exercicio + ", realizacao=" + realizacao + ", duracao="
				+ duracao + ", calorias=" + calorias + ", observacao=" + observacao + "]";
	}

}
