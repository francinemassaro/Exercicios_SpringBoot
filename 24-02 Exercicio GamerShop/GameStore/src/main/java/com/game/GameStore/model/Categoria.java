package com.game.GameStore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String categoria;
	
	@OneToOne
	@JsonIgnoreProperties("categoria")
	private FaixaEtaria faixa;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public FaixaEtaria getFaixa() {
		return faixa;
	}
	public void setFaixa(FaixaEtaria faixa) {
		this.faixa = faixa;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	

}
