package com.game.GameStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.GameStore.model.FaixaEtaria;

@Repository
public interface FaixaEtariaRepository extends JpaRepository<FaixaEtaria, Long>{
	public List<FaixaEtaria>findAllByFaixaContainingIgnoreCase(String faixa);
}
