package com.matheus.controleproducao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.controleproducao.model.Moinho;

public interface MoinhoRepository extends JpaRepository<Moinho, Long> {
}