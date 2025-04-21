package com.matheus.controleproducao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.controleproducao.model.Pigmento;

public interface PigmentoRepository extends JpaRepository<Pigmento, Long> {
}