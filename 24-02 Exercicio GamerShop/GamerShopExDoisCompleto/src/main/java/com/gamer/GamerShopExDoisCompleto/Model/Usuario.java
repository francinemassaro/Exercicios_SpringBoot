package com.gamer.GamerShopExDoisCompleto.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue
	private long id;
	@NotNull
	@Column(name="Nome")
	private String nomeUsuario;
	private String contato;
	

	@OneToMany(mappedBy="usuario", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List <Produto> produto;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomeUsuario() {
		return nomeUsuario;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}


	public List<Produto> getProduto() {
		return produto;
	}


	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
	
}
