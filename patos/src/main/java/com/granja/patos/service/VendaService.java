package com.granja.patos.service;

import com.granja.patos.dto.VendaDTO;
import com.granja.patos.model.Cliente;
import com.granja.patos.model.Pato;
import com.granja.patos.model.PatoVenda;
import com.granja.patos.model.Venda;
import com.granja.patos.model.Vendedor;
import com.granja.patos.repository.ClienteRepository;
import com.granja.patos.repository.PatoRepository;
import com.granja.patos.repository.PatoVendaRepository;
import com.granja.patos.repository.VendaRepository;
import com.granja.patos.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private PatoRepository patoRepository;

    @Autowired
    private PatoVendaRepository patoVendaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private VendedorRepository vendedorRepository;

    public Venda registrarVenda(VendaDTO vendaDTO) {
        Cliente cliente = clienteRepository.findById(vendaDTO.getClienteId())
                .orElseThrow(() -> new RuntimeException("Client não concentrate"));
        Vendedor vendedor = vendedorRepository.findById(VendaDTO.getVendedorId())
                .orElseThrow(() -> new RuntimeException("Vendor não concentrate")).getVendedor();

        Venda venda = new Venda();
        venda.setData(LocalDate.now());
        venda.setCliente(cliente);
        venda.setVendedor(vendedor);
        Venda vendaSalva = vendaRepository.save(venda);

        for (Long patoId : vendaDTO.getPatosIds()) {
            Pato pato = patoRepository.findById(patoId)
                    .orElseThrow(() -> new RuntimeException("Pato não encontrado"));
            pato.setVendido(true);
            patoRepository.save(pato);

            PatoVenda patoVenda = new PatoVenda();
            patoVenda.setPato(pato);
            patoVenda.setVenda(vendaSalva);
            patoVenda.setValor(calcularValorPato(pato));
            patoVendaRepository.save(patoVenda);
        }

        return vendaSalva;
    }

    private Double calcularValorPato(Pato pato) {
        // Implementer logical para calculator valor do pato com base nos filhos
        return 70.0; // Exemplo simplificado
    }

    public List<Venda> getAllVendas() {
        return vendaRepository.findAll();
    }
}
