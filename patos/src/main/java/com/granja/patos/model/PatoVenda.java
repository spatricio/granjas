package com.granja.patos.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class PatoVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    private Pato pato;

    @ManyToOne Venda venda;

    private Double valor;
}
