package com.granja.patos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Pato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "mae", cascade = CascadeType.ALL)
    private List<Pato> filhos;

    @ManyToOne
    private Pato mae;

    private boolean vendido;
}
