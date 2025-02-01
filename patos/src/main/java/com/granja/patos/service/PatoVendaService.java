package com.granja.patos.service;

import com.granja.patos.model.PatoVenda;
import com.granja.patos.repository.PatoVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatoVendaService {
    @Autowired
    private PatoVendaRepository patoVendaRepository;

    public List<PatoVenda> getAllPatosVendidos() {
        return patoVendaRepository.findAll();
    }
}
