package com.granja.patos.service;

import com.granja.patos.model.Pato;
import org.springframework.stereotype.Service;

@Service
public class PatoService {

    private Double calcularValorPato(Pato pato) {
        // Valor base
        double valorBase = 70.0;

        // Obter o número de filhos
        int numeroDeFilhos = (pato.getFilhos() != null) ? pato.getFilhos().size() : 0;

        // Ajustar valor com base no número de filhos
        double valorFinal = valorBase;

        if (numeroDeFilhos > 0 && numeroDeFilhos <= 3) {
            valorFinal *= 1.1; // Aumenta 10% se tiver até 3 filhos
        } else if (numeroDeFilhos > 3 && numeroDeFilhos <= 5) {
            valorFinal *= 1.25; // Aumenta 25% se tiver entre 4 e 5 filhos
        } else if (numeroDeFilhos > 5) {
            valorFinal *= 1.5; // Aumenta 50% se tiver mais de 5 filhos
        }

        // Ajustar valor se o pato tiver uma mãe
        if (pato.getMae() != null) {
            valorFinal += 20.0; // Adiciona 20.0 se o pato tiver uma mãe
        }

        // Retornar o valor final calculado
        return valorFinal;
    }
}
