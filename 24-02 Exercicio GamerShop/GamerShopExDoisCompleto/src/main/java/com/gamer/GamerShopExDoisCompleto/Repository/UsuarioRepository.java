package com.gamer.GamerShopExDoisCompleto.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamer.GamerShopExDoisCompleto.Model.Produto;
import com.gamer.GamerShopExDoisCompleto.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Produto>findAllByNomeUsuarioContainingIgnoreCase(String nomeUsuario);

}
