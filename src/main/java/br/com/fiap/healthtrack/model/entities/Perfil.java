package br.com.fiap.healthtrack.model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Perfil implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Double meta;
	private Double altura;
	private Double peso;
	
	private Usuario usuario;
	
	public Perfil() {
	}

	public Perfil(Integer id, Double meta, Double altura, Double peso, Usuario usuario) {
		this.id = id;
		this.meta = meta;
		this.altura = altura;
		this.peso = peso;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getMeta() {
		return meta;
	}

	public void setMeta(Double meta) {
		this.meta = meta;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, id, meta, peso, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		return Objects.equals(altura, other.altura) && Objects.equals(id, other.id) && Objects.equals(meta, other.meta)
				&& Objects.equals(peso, other.peso) && Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", meta=" + meta + ", altura=" + altura + ", peso=" + peso + ", usuario=" + usuario
				+ "]";
	}
	
}
