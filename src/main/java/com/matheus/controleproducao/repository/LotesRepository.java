package com.matheus.controleproducao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.controleproducao.model.Lotes;

public interface LotesRepository extends JpaRepository<Lotes, Long>{
    
}
