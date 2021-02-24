package com.gamer.GamerShopExDoisCompleto.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamer.GamerShopExDoisCompleto.Model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria>findAllByCategoriaContainingIgnoreCase(String categoria);

}
