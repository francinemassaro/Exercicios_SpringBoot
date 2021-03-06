package com.hakimfarma.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categoria")
public class CategoriaModel {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy="categoria", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List <ProdutoModel> produto;

	
	
	


	public List<ProdutoModel> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/*@OneToMany(mappedBy="descricao",cascade=CascadeType.ALL)
	@JsonIgnoreProperties("descricao")
	private List <ProdutoModel> produto; */

}
