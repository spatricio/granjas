package com.granja.patos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.granja.patos.model.Cliente;
public interface ClienteRepository extends JpaRepository<Cliente, Long> { }
