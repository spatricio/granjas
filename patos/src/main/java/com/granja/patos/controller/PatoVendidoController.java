package com.granja.patos.controller;

import com.granja.patos.model.PatoVenda;
import com.granja.patos.service.PatoVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patos-vendidos")

public class PatoVendidoController {
    @Autowired
    private PatoVendaService patoVendaService;

    @GetMapping
    public List<PatoVenda> listarPatosVendidos() {
        return patoVendaService.getAllPatosVendidos();
    }
}
