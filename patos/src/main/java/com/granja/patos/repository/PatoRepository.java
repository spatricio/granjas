package com.granja.patos.repository;

import com.granja.patos.model.Pato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatoRepository extends JpaRepository<Pato, Long> {}
