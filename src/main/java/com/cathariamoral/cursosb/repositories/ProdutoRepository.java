package com.cathariamoral.cursosb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cathariamoral.cursosb.domain.Produto;

@Repository
//os parametros são o objeto e o tipo do atributo identificador 
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	
	
}
