package com.granja.patos.controller;

import com.granja.patos.model.Cliente;
import com.granja.patos.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
    @Autowired
    private ClientService clienteService;

    @PostMapping
    public List<Cliente> getAllClientes(){
        return clienteService.getAllClientes();
    }
}
