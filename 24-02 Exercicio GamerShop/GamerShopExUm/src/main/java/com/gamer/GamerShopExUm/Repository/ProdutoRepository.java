package com.gamer.GamerShopExUm.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamer.GamerShopExUm.Model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto>findAllByNomeContainingIgnoreCase(String nome);
}