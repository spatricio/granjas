package com.granja.patos.service;

import com.granja.patos.model.Cliente;
import com.granja.patos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List; // Importação corrigida

@Service
public class ClientService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente); // Corrigido
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
}
