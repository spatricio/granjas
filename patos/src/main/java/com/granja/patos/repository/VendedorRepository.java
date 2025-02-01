package com.granja.patos.repository;

import com.granja.patos.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Venda, Long> { }
