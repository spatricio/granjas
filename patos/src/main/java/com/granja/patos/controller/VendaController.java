package com.granja.patos.controller;

import com.granja.patos.dto.VendaDTO; // Corrigir a importação para o pacote correto
import com.granja.patos.model.Venda;
import com.granja.patos.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping
    public Venda createVenda(@RequestBody VendaDTO vendaDTO) {
        return vendaService.registrarVenda(vendaDTO);
    }

    @GetMapping
    public List<Venda> getAllVendas() {
        return vendaService.getAllVendas();
    }
}
