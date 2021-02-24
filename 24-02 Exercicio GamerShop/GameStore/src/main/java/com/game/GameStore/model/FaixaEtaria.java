package com.game.GameStore.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hakimfarma.farmacia.model.ProdutoModel;

@Entity
@Table(name="faixa_etaria")
public class FaixaEtaria {
	
	@Id
	@GeneratedValue
	public long id;
	@NotNull
	public String faixa;

	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFaixa() {
		return faixa;
	}
	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}
}
