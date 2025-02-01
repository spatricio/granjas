package com.granja.patos.service;


import com.granja.patos.model.Vendedor;
import com.granja.patos.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;

    public Vendedor saveVendedor(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public List<Vendedor> getAllVendedores() {
        return vendedorRepository.findAll();
    }
}
