package com.granja.patos.controller;

import com.granja.patos.model.Vendedor;
import com.granja.patos.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vendedores")

public class VendedorController {
    @Autowired
    private VendedorService vendedorService;

    @PostMapping
    public Vendedor createVendedor(@RequestBody Vendedor vendedor) {
        return vendedorService.getAllVendedores();
    }

}
