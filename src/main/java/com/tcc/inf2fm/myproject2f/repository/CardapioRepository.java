package com.tcc.inf2fm.myproject2f.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcc.inf2fm.myproject2f.model.Cardapio;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, Long> {

}
