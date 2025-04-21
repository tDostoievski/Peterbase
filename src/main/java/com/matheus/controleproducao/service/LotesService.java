package com.matheus.controleproducao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.controleproducao.model.Lotes;
import com.matheus.controleproducao.repository.LotesRepository;


@Service 
public class LotesService {
    @Autowired
    private LotesRepository lotesRepository;

    public void salvar(Lotes lote){
        lotesRepository.save(lote);
    }
}
